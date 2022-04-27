package com.sample;

import com.medplum.AuthHeader;
import com.medplum.services.fhir.FhirService;
import com.medplum.types.fhir.Practitioner;
import com.medplum.types.fhir.ResourceList;

public final class Main {

    // Put your access key in an environment variable called MEDPLUM_ACCESS_KEY!
    private static final String MEDPLUM_ACCESS_KEY = System.getenv("MEDPLUM_ACCESS_KEY");

    public static void main(String... args) {

        System.out.println("Configuring Medplum client...");
        FhirService fhirService = FhirService.getClient("https://api.medplum.com/");

        System.out.println("Calling readResource...");
        AuthHeader authHeader = AuthHeader.valueOf(MEDPLUM_ACCESS_KEY);
        ResourceList result = fhirService.readResource(
                authHeader, "Practitioner", "576b4c88-ad0b-4a1a-9b50-3921bb87ca79");

        if (result.isPractitioner()) {
            System.out.println("Received practitioner!");
            Practitioner practitioner = result.getPractitioner().get();
            practitioner.name().ifPresent(names -> {
                names.forEach(name ->
                        name.family().ifPresent(familyName ->
                                System.out.println("Practioner has family name " + familyName)));
            });
        } else {
            throw new RuntimeException("Expected practitioner, but received other...");
        }
    }
}

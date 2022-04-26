package com.fhir;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fhir.services.fhir.FhirService;
import com.fhir.types.fhir.Practitioner;
import com.fhir.types.fhir.ResourceList;

public final class Main {

    public static void main(String... args) throws JsonProcessingException {
        FhirService fhirService = FhirService.getClient("https://api.medplum.com/");
        String authHeader = System.getenv("MEDPLUM_ACCESS_KEY");
        System.out.println("Asking Medplum for resource!");
        ResourceList result = fhirService.readResource(
                "Practitioner", "576b4c88-ad0b-4a1a-9b50-3921bb87ca79");
        if (result.isPractitioner()) {
            System.out.println("Medplum returned a practitioner!");
            Practitioner practitioner = result.getPractitioner().get();
            practitioner.name().ifPresent(names -> {
                names.forEach(name ->
                        name.family().ifPresent(familyName ->
                                System.out.println("Practioner has family name " + familyName)));
            });
        }
    }
}

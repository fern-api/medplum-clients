package com.fhir;

import com.fasterxml.jackson.core.JsonProcessingException;

public final class Main {

    public static void main(String... args) throws JsonProcessingException {
        FhirJerseyService fhirJerseyService = FhirJerseyService.getClient("https://api.medplum.com/");
        String authHeader = System.getenv("MEDPLUM_ACCESS_KEY");
        System.out.println("Asking Medplum for resource!");
        ResourceList result = fhirJerseyService.readResource(
                "Bearer " + authHeader, "Practitioner", "576b4c88-ad0b-4a1a-9b50-3921bb87ca79");
        if (result.isPractitioner()) {
            System.out.println("Medplum returned a practitioner: "
                    + ObjectMappers.CLIENT_OBJECT_MAPPER.writeValueAsString(result));
            Practitioner practitioner = result.getPractitioner().get();
            practitioner.name().ifPresent(names -> {
                names.forEach(name ->
                        name.family().ifPresent(familyName ->
                                System.out.println("Practioner has family name " + familyName)));
            });
        }
    }
}

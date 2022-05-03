package com.sample;

import com.medplum.AuthHeader;
import com.medplum.services.fhir.FhirService;
import com.medplum.services.fhir.Oauth2Service;
import com.medplum.types.fhir.GetTokenResponse;
import com.medplum.types.fhir.Practitioner;
import com.medplum.types.fhir.ResourceList;
import io.github.cdimascio.dotenv.Dotenv;

public final class Main {

    public static void main(String... args) {
        // Put your client id in the .env file!
        Dotenv dotenv = Dotenv.configure()
                .directory("medplum-sample-application/")
                .load();
        String medplumClientId = dotenv.get("MEDPLUM_CLIENT_ID");
        String medplumClientSecret = dotenv.get("MEDPLUM_CLIENT_SECRET");

        Oauth2Service oauth2Service = Oauth2Service.getClient("https://api.medplum.com/");
        System.out.println("Getting medplum access token...");
        GetTokenResponse getTokenResponse =
                oauth2Service.getToken("client_credentials", medplumClientId, medplumClientSecret);
        String accessToken = getTokenResponse.access_token();
        AuthHeader authHeader = AuthHeader.valueOf(accessToken);

        FhirService fhirService = FhirService.getClient("https://api.medplum.com/");
        System.out.println("Calling readResource...");
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

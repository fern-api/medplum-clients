package com.fhir;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.palantir.conjure.java.api.config.service.UserAgent;
import com.palantir.conjure.java.client.config.ClientConfiguration;
import com.palantir.conjure.java.client.config.ClientConfigurations;
import com.palantir.conjure.java.client.jaxrs.JaxRsClient;
import com.palantir.conjure.java.okhttp.HostMetricsRegistry;
import com.palantir.conjure.java.serialization.ObjectMappers;
import com.palantir.tokens.auth.AuthHeader;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collections;

public final class Main {

    public static void main(String... args) throws JsonProcessingException {
        FhirJerseyService fhirJerseyService = getClient(FhirJerseyService.class, "https://api.medplum.com/");
        AuthHeader authHeader = AuthHeader.valueOf(System.getenv("MEDPLUM_ACCESS_KEY"));
        System.out.println("Asking Medplum for resource!");
        ResourceList result = fhirJerseyService.readResource(
                authHeader, "Practitioner", "576b4c88-ad0b-4a1a-9b50-3921bb87ca79");
        if (result.isPractitioner()) {
            System.out.println("Medplum returned a practitioner: "
                    + ObjectMappers.newClientObjectMapper().writeValueAsString(result));
            Practitioner practitioner = result.getPractitioner().get();
            practitioner.name().ifPresent(names -> {
                names.forEach(name ->
                        name.family().ifPresent(familyName ->
                                System.out.println("Practioner has family name " + familyName)));
            });
        }
    }

    public static <T> T getClient(Class<T> clazz, String url) {
        try {
            SSLContext ctx = SSLContext.getInstance("TLS");
            ctx.init(null, new TrustManager[] {BlindTrustManager.INSTANCE}, null);
            UserAgent userAgent = UserAgent.of(UserAgent.Agent.of("medplum-test", "0.0.0"));
            ClientConfiguration config = ClientConfigurations.of(
                    Collections.singletonList(url), ctx.getSocketFactory(), BlindTrustManager.INSTANCE);
            HostMetricsRegistry hostMetricsRegistry = new HostMetricsRegistry();
            return JaxRsClient.create(clazz, userAgent, hostMetricsRegistry, config);
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            throw new RuntimeException(e);
        }
    }

    private static class BlindTrustManager implements X509TrustManager {

        private static final BlindTrustManager INSTANCE = new BlindTrustManager();

        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {}

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {}

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }
}

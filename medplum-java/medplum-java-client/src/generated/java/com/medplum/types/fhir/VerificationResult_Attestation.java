package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableVerificationResult_Attestation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface VerificationResult_Attestation {
  Optional<Signature> sourceSignature();

  Optional<CodeableConcept> communicationMethod();

  Optional<List<Extension>> extension();

  Optional<String> proxyIdentityCertificate();

  Optional<String> id();

  Optional<Date> date();

  Optional<List<Extension>> modifierExtension();

  Optional<String> sourceIdentityCertificate();

  Optional<Reference> who();

  Optional<Signature> proxySignature();

  Optional<Reference> onBehalfOf();

  static ImmutableVerificationResult_Attestation.Builder builder() {
    return ImmutableVerificationResult_Attestation.builder();
  }
}

package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<date> date();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Reference> onBehalfOf();

  Optional<Reference> who();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> communicationMethod();

  Optional<Signature> proxySignature();

  Optional<Signature> sourceSignature();

  Optional<String> sourceIdentityCertificate();

  Optional<String> proxyIdentityCertificate();

  static ImmutableVerificationResult_Attestation.Builder builder() {
    return ImmutableVerificationResult_Attestation.builder();
  }
}

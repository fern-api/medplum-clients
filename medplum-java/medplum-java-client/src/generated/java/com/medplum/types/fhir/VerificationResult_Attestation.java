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
  Optional<Reference> who();

  Optional<Date> date();

  Optional<List<Extension>> extension();

  Optional<Signature> proxySignature();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> communicationMethod();

  Optional<Signature> sourceSignature();

  Optional<Reference> onBehalfOf();

  Optional<String> sourceIdentityCertificate();

  Optional<String> proxyIdentityCertificate();

  static ImmutableVerificationResult_Attestation.Builder builder() {
    return ImmutableVerificationResult_Attestation.builder();
  }
}

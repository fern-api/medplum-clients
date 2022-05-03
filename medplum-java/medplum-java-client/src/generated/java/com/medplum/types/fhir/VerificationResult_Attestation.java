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
  Optional<String> proxyIdentityCertificate();

  Optional<Signature> sourceSignature();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> who();

  Optional<Signature> proxySignature();

  Optional<Date> date();

  Optional<CodeableConcept> communicationMethod();

  Optional<Reference> onBehalfOf();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> sourceIdentityCertificate();

  static ImmutableVerificationResult_Attestation.Builder builder() {
    return ImmutableVerificationResult_Attestation.builder();
  }
}

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
    as = ImmutableVerificationResult_Validator.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface VerificationResult_Validator {
  Optional<String> id();

  Optional<String> identityCertificate();

  Optional<Signature> attestationSignature();

  Optional<List<Extension>> extension();

  Reference organization();

  Optional<List<Extension>> modifierExtension();

  static ImmutableVerificationResult_Validator.OrganizationBuildStage builder() {
    return ImmutableVerificationResult_Validator.builder();
  }
}

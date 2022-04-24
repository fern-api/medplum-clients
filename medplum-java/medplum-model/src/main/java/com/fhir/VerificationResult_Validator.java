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
    as = ImmutableVerificationResult_Validator.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface VerificationResult_Validator {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> identityCertificate();

  Optional<String> id();

  Optional<Signature> attestationSignature();

  Reference organization();

  static ImmutableVerificationResult_Validator.OrganizationBuildStage builder() {
    return ImmutableVerificationResult_Validator.builder();
  }
}

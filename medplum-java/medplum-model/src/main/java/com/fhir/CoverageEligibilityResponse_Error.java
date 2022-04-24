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
    as = ImmutableCoverageEligibilityResponse_Error.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityResponse_Error {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> id();

  CodeableConcept code();

  static ImmutableCoverageEligibilityResponse_Error.CodeBuildStage builder() {
    return ImmutableCoverageEligibilityResponse_Error.builder();
  }
}

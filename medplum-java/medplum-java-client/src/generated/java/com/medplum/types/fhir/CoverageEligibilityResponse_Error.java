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
    as = ImmutableCoverageEligibilityResponse_Error.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityResponse_Error {
  Optional<List<Extension>> modifierExtension();

  CodeableConcept code();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableCoverageEligibilityResponse_Error.CodeBuildStage builder() {
    return ImmutableCoverageEligibilityResponse_Error.builder();
  }
}

package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCoverageEligibilityRequest_Insurance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityRequest_Insurance {
  Optional<List<Extension>> modifierExtension();

  Reference coverage();

  Optional<List<Extension>> extension();

  Optional<Boolean> focal();

  Optional<String> id();

  Optional<String> businessArrangement();

  static ImmutableCoverageEligibilityRequest_Insurance.CoverageBuildStage builder() {
    return ImmutableCoverageEligibilityRequest_Insurance.builder();
  }
}

package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCoverageEligibilityResponse_Insurance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityResponse_Insurance {
  Optional<List<Extension>> modifierExtension();

  Optional<Period> benefitPeriod();

  Optional<List<CoverageEligibilityResponse_Item>> item();

  Optional<String> id();

  Optional<Boolean> inforce();

  Optional<List<Extension>> extension();

  Reference coverage();

  static ImmutableCoverageEligibilityResponse_Insurance.CoverageBuildStage builder() {
    return ImmutableCoverageEligibilityResponse_Insurance.builder();
  }
}

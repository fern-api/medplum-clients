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
    as = ImmutableCoverageEligibilityRequest_SupportingInfo.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityRequest_SupportingInfo {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Boolean> appliesToAll();

  Optional<List<Extension>> modifierExtension();

  Optional<positiveInt> sequence();

  Reference information();

  static ImmutableCoverageEligibilityRequest_SupportingInfo.InformationBuildStage builder() {
    return ImmutableCoverageEligibilityRequest_SupportingInfo.builder();
  }
}

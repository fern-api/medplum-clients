package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCoverageEligibilityResponse_Benefit.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityResponse_Benefit {
  Optional<String> id();

  CodeableConcept type();

  Optional<String> allowedString();

  Optional<String> usedString();

  Optional<Double> usedUnsignedInt();

  Optional<Money> usedMoney();

  Optional<Money> allowedMoney();

  Optional<List<Extension>> extension();

  Optional<Double> allowedUnsignedInt();

  Optional<List<Extension>> modifierExtension();

  static ImmutableCoverageEligibilityResponse_Benefit.TypeBuildStage builder() {
    return ImmutableCoverageEligibilityResponse_Benefit.builder();
  }
}

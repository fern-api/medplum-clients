package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<Double> usedUnsignedInt();

  Optional<String> id();

  CodeableConcept type();

  Optional<Money> usedMoney();

  Optional<String> usedString();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Double> allowedUnsignedInt();

  Optional<Money> allowedMoney();

  Optional<String> allowedString();

  static ImmutableCoverageEligibilityResponse_Benefit.TypeBuildStage builder() {
    return ImmutableCoverageEligibilityResponse_Benefit.builder();
  }
}

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
    as = ImmutableRiskEvidenceSynthesis_PrecisionEstimate.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RiskEvidenceSynthesis_PrecisionEstimate {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<decimal> from();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<decimal> to();

  Optional<decimal> level();

  static ImmutableRiskEvidenceSynthesis_PrecisionEstimate.Builder builder() {
    return ImmutableRiskEvidenceSynthesis_PrecisionEstimate.builder();
  }
}

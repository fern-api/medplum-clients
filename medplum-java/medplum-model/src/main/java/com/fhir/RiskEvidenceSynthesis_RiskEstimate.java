package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableRiskEvidenceSynthesis_RiskEstimate.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RiskEvidenceSynthesis_RiskEstimate {
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> unitOfMeasure();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<List<RiskEvidenceSynthesis_PrecisionEstimate>> precisionEstimate();

  Optional<String> id();

  Optional<String> description();

  Optional<decimal> value();

  Optional<Integer> numeratorCount();

  Optional<Integer> denominatorCount();

  static ImmutableRiskEvidenceSynthesis_RiskEstimate.Builder builder() {
    return ImmutableRiskEvidenceSynthesis_RiskEstimate.builder();
  }
}

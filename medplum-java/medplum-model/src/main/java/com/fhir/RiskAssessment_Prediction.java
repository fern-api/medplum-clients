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
    as = ImmutableRiskAssessment_Prediction.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RiskAssessment_Prediction {
  Optional<decimal> relativeRisk();

  Optional<List<Extension>> extension();

  Optional<Period> whenPeriod();

  Optional<String> rationale();

  Optional<Range> probabilityRange();

  Optional<CodeableConcept> qualitativeRisk();

  Optional<Range> whenRange();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> outcome();

  Optional<Double> probabilityDecimal();

  static ImmutableRiskAssessment_Prediction.Builder builder() {
    return ImmutableRiskAssessment_Prediction.builder();
  }
}

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
    as = ImmutableRiskAssessment_Prediction.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RiskAssessment_Prediction {
  Optional<List<Extension>> modifierExtension();

  Optional<Period> whenPeriod();

  Optional<CodeableConcept> qualitativeRisk();

  Optional<String> id();

  Optional<String> rationale();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> outcome();

  Optional<Double> probabilityDecimal();

  Optional<Range> whenRange();

  Optional<Range> probabilityRange();

  Optional<Decimal> relativeRisk();

  static ImmutableRiskAssessment_Prediction.Builder builder() {
    return ImmutableRiskAssessment_Prediction.builder();
  }
}

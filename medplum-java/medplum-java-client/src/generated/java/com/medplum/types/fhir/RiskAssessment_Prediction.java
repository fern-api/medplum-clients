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
  Optional<String> id();

  Optional<Double> probabilityDecimal();

  Optional<Range> probabilityRange();

  Optional<Period> whenPeriod();

  Optional<Range> whenRange();

  Optional<Decimal> relativeRisk();

  Optional<List<Extension>> modifierExtension();

  Optional<String> rationale();

  Optional<CodeableConcept> outcome();

  Optional<CodeableConcept> qualitativeRisk();

  Optional<List<Extension>> extension();

  static ImmutableRiskAssessment_Prediction.Builder builder() {
    return ImmutableRiskAssessment_Prediction.builder();
  }
}

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
  Optional<Double> probabilityDecimal();

  Optional<Period> whenPeriod();

  Optional<String> id();

  Optional<CodeableConcept> qualitativeRisk();

  Optional<List<Extension>> extension();

  Optional<Range> probabilityRange();

  Optional<CodeableConcept> outcome();

  Optional<String> rationale();

  Optional<List<Extension>> modifierExtension();

  Optional<Decimal> relativeRisk();

  Optional<Range> whenRange();

  static ImmutableRiskAssessment_Prediction.Builder builder() {
    return ImmutableRiskAssessment_Prediction.builder();
  }
}

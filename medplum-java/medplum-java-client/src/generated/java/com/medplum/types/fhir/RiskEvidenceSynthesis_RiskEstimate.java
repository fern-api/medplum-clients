package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<Integer> denominatorCount();

  Optional<Decimal> value();

  Optional<CodeableConcept> unitOfMeasure();

  Optional<String> id();

  Optional<Integer> numeratorCount();

  Optional<List<RiskEvidenceSynthesis_PrecisionEstimate>> precisionEstimate();

  Optional<CodeableConcept> type();

  static ImmutableRiskEvidenceSynthesis_RiskEstimate.Builder builder() {
    return ImmutableRiskEvidenceSynthesis_RiskEstimate.builder();
  }
}

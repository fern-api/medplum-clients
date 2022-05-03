package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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

  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  Optional<Decimal> to();

  Optional<Decimal> level();

  Optional<Decimal> from();

  static ImmutableRiskEvidenceSynthesis_PrecisionEstimate.Builder builder() {
    return ImmutableRiskEvidenceSynthesis_PrecisionEstimate.builder();
  }
}

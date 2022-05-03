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
  Optional<Decimal> from();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Decimal> to();

  Optional<CodeableConcept> type();

  Optional<Decimal> level();

  Optional<List<Extension>> modifierExtension();

  static ImmutableRiskEvidenceSynthesis_PrecisionEstimate.Builder builder() {
    return ImmutableRiskEvidenceSynthesis_PrecisionEstimate.builder();
  }
}

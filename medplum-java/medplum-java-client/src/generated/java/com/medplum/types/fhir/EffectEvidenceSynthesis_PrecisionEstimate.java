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
    as = ImmutableEffectEvidenceSynthesis_PrecisionEstimate.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EffectEvidenceSynthesis_PrecisionEstimate {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Decimal> level();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<Decimal> from();

  Optional<Decimal> to();

  static ImmutableEffectEvidenceSynthesis_PrecisionEstimate.Builder builder() {
    return ImmutableEffectEvidenceSynthesis_PrecisionEstimate.builder();
  }
}

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
    as = ImmutableEffectEvidenceSynthesis_PrecisionEstimate.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EffectEvidenceSynthesis_PrecisionEstimate {
  Optional<decimal> to();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<decimal> level();

  Optional<decimal> from();

  static ImmutableEffectEvidenceSynthesis_PrecisionEstimate.Builder builder() {
    return ImmutableEffectEvidenceSynthesis_PrecisionEstimate.builder();
  }
}

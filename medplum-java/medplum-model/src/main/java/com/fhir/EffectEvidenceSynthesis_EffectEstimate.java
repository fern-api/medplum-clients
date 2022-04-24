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
    as = ImmutableEffectEvidenceSynthesis_EffectEstimate.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EffectEvidenceSynthesis_EffectEstimate {
  Optional<decimal> value();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<String> description();

  Optional<String> id();

  Optional<CodeableConcept> unitOfMeasure();

  Optional<List<EffectEvidenceSynthesis_PrecisionEstimate>> precisionEstimate();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> variantState();

  static ImmutableEffectEvidenceSynthesis_EffectEstimate.Builder builder() {
    return ImmutableEffectEvidenceSynthesis_EffectEstimate.builder();
  }
}

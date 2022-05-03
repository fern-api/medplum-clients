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
    as = ImmutableEffectEvidenceSynthesis_EffectEstimate.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EffectEvidenceSynthesis_EffectEstimate {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> variantState();

  Optional<String> description();

  Optional<List<EffectEvidenceSynthesis_PrecisionEstimate>> precisionEstimate();

  Optional<Decimal> value();

  Optional<CodeableConcept> unitOfMeasure();

  static ImmutableEffectEvidenceSynthesis_EffectEstimate.Builder builder() {
    return ImmutableEffectEvidenceSynthesis_EffectEstimate.builder();
  }
}

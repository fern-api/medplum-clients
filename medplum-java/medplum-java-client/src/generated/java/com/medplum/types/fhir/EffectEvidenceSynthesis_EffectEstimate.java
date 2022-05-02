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
  Optional<CodeableConcept> type();

  Optional<Decimal> value();

  Optional<String> description();

  Optional<CodeableConcept> unitOfMeasure();

  Optional<List<Extension>> modifierExtension();

  Optional<List<EffectEvidenceSynthesis_PrecisionEstimate>> precisionEstimate();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> variantState();

  static ImmutableEffectEvidenceSynthesis_EffectEstimate.Builder builder() {
    return ImmutableEffectEvidenceSynthesis_EffectEstimate.builder();
  }
}

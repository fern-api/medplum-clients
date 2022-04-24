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
    as = ImmutableEffectEvidenceSynthesis_Certainty.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EffectEvidenceSynthesis_Certainty {
  Optional<List<Extension>> modifierExtension();

  Optional<List<EffectEvidenceSynthesis_CertaintySubcomponent>> certaintySubcomponent();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> rating();

  Optional<String> id();

  Optional<List<Annotation>> note();

  static ImmutableEffectEvidenceSynthesis_Certainty.Builder builder() {
    return ImmutableEffectEvidenceSynthesis_Certainty.builder();
  }
}

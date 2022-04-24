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
    as = ImmutableEffectEvidenceSynthesis_CertaintySubcomponent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EffectEvidenceSynthesis_CertaintySubcomponent {
  Optional<List<Annotation>> note();

  Optional<CodeableConcept> type();

  Optional<List<CodeableConcept>> rating();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableEffectEvidenceSynthesis_CertaintySubcomponent.Builder builder() {
    return ImmutableEffectEvidenceSynthesis_CertaintySubcomponent.builder();
  }
}

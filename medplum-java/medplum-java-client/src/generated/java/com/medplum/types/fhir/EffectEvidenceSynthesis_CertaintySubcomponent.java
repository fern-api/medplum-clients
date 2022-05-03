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
    as = ImmutableEffectEvidenceSynthesis_CertaintySubcomponent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EffectEvidenceSynthesis_CertaintySubcomponent {
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> rating();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableEffectEvidenceSynthesis_CertaintySubcomponent.Builder builder() {
    return ImmutableEffectEvidenceSynthesis_CertaintySubcomponent.builder();
  }
}

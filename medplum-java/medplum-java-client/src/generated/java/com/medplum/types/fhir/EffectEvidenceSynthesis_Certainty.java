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
    as = ImmutableEffectEvidenceSynthesis_Certainty.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EffectEvidenceSynthesis_Certainty {
  Optional<List<EffectEvidenceSynthesis_CertaintySubcomponent>> certaintySubcomponent();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<CodeableConcept>> rating();

  Optional<List<Annotation>> note();

  static ImmutableEffectEvidenceSynthesis_Certainty.Builder builder() {
    return ImmutableEffectEvidenceSynthesis_Certainty.builder();
  }
}

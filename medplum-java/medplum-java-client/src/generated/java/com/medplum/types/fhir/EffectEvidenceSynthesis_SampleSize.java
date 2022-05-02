package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableEffectEvidenceSynthesis_SampleSize.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EffectEvidenceSynthesis_SampleSize {
  Optional<Integer> numberOfStudies();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Integer> numberOfParticipants();

  static ImmutableEffectEvidenceSynthesis_SampleSize.Builder builder() {
    return ImmutableEffectEvidenceSynthesis_SampleSize.builder();
  }
}
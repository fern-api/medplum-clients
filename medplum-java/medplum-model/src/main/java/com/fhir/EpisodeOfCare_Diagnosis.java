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
    as = ImmutableEpisodeOfCare_Diagnosis.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EpisodeOfCare_Diagnosis {
  Optional<CodeableConcept> role();

  Optional<positiveInt> rank();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Reference condition();

  Optional<List<Extension>> modifierExtension();

  static ImmutableEpisodeOfCare_Diagnosis.ConditionBuildStage builder() {
    return ImmutableEpisodeOfCare_Diagnosis.builder();
  }
}

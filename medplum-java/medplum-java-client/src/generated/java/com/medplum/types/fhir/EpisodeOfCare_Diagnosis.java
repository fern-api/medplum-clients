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
    as = ImmutableEpisodeOfCare_Diagnosis.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EpisodeOfCare_Diagnosis {
  Optional<PositiveInt> rank();

  Optional<String> id();

  Optional<CodeableConcept> role();

  Optional<List<Extension>> extension();

  Reference condition();

  Optional<List<Extension>> modifierExtension();

  static ImmutableEpisodeOfCare_Diagnosis.ConditionBuildStage builder() {
    return ImmutableEpisodeOfCare_Diagnosis.builder();
  }
}

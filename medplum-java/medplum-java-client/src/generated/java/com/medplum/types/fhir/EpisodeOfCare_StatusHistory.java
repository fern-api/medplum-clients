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
    as = ImmutableEpisodeOfCare_StatusHistory.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EpisodeOfCare_StatusHistory {
  Optional<Episodeofcare_statushistoryStatus> status();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Period period();

  Optional<List<Extension>> modifierExtension();

  static ImmutableEpisodeOfCare_StatusHistory.PeriodBuildStage builder() {
    return ImmutableEpisodeOfCare_StatusHistory.builder();
  }
}

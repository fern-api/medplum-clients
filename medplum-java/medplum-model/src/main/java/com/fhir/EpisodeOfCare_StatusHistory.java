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
    as = ImmutableEpisodeOfCare_StatusHistory.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EpisodeOfCare_StatusHistory {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Period period();

  Optional<Episodeofcare_statushistoryStatus> status();

  Optional<List<Extension>> extension();

  static ImmutableEpisodeOfCare_StatusHistory.PeriodBuildStage builder() {
    return ImmutableEpisodeOfCare_StatusHistory.builder();
  }
}

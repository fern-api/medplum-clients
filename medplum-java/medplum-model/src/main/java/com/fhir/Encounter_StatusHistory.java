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
    as = ImmutableEncounter_StatusHistory.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Encounter_StatusHistory {
  Optional<Encounter_statushistoryStatus> status();

  Period period();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  static ImmutableEncounter_StatusHistory.PeriodBuildStage builder() {
    return ImmutableEncounter_StatusHistory.builder();
  }
}

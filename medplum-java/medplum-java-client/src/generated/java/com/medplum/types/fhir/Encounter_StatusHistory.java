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
    as = ImmutableEncounter_StatusHistory.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Encounter_StatusHistory {
  Optional<List<Extension>> modifierExtension();

  Period period();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Encounter_statushistoryStatus> status();

  static ImmutableEncounter_StatusHistory.PeriodBuildStage builder() {
    return ImmutableEncounter_StatusHistory.builder();
  }
}

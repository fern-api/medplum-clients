package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableEncounter_ClassHistory.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Encounter_ClassHistory {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Period period();

  @JsonProperty("class")
  Coding _class();

  static ImmutableEncounter_ClassHistory.PeriodBuildStage builder() {
    return ImmutableEncounter_ClassHistory.builder();
  }
}

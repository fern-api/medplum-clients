package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  @JsonProperty("class")
  Coding _class();

  Period period();

  Optional<List<Extension>> extension();

  static ImmutableEncounter_ClassHistory._classBuildStage builder() {
    return ImmutableEncounter_ClassHistory.builder();
  }
}

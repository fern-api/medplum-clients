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
    as = ImmutableActivityDefinition_Participant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ActivityDefinition_Participant {
  Optional<code> type();

  Optional<String> id();

  Optional<CodeableConcept> role();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableActivityDefinition_Participant.Builder builder() {
    return ImmutableActivityDefinition_Participant.builder();
  }
}

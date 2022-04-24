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
    as = ImmutablePlanDefinition_Participant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition_Participant {
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> role();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Plandefinition_participantType> type();

  static ImmutablePlanDefinition_Participant.Builder builder() {
    return ImmutablePlanDefinition_Participant.builder();
  }
}

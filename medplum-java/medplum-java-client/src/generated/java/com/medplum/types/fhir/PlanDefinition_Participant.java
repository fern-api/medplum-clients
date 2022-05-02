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
    as = ImmutablePlanDefinition_Participant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition_Participant {
  Optional<CodeableConcept> role();

  Optional<String> id();

  Optional<Plandefinition_participantType> type();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutablePlanDefinition_Participant.Builder builder() {
    return ImmutablePlanDefinition_Participant.builder();
  }
}

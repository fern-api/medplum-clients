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
    as = ImmutableGoal.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Goal {
  Optional<List<Extension>> modifierExtension();

  Optional<Date> statusDate();

  Optional<CodeableConcept> startCodeableConcept();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  Optional<Reference> expressedBy();

  Optional<Uri> implicitRules();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> outcomeCode();

  Optional<Id> id();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<String> statusReason();

  Optional<List<Reference>> addresses();

  Optional<List<Reference>> outcomeReference();

  Optional<List<CodeableConcept>> category();

  Optional<GoalLifecyclestatus> lifecycleStatus();

  Optional<List<Goal_Target>> target();

  Optional<String> startDate();

  String resourceType();

  Optional<CodeableConcept> priority();

  Reference subject();

  Optional<Meta> meta();

  Optional<CodeableConcept> achievementStatus();

  CodeableConcept description();

  Optional<Narrative> text();

  static ImmutableGoal.ResourceTypeBuildStage builder() {
    return ImmutableGoal.builder();
  }
}

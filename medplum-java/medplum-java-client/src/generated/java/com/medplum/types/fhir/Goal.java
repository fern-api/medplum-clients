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
  Optional<Id> id();

  Optional<CodeableConcept> startCodeableConcept();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> outcomeCode();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> category();

  Optional<CodeableConcept> priority();

  Optional<GoalLifecyclestatus> lifecycleStatus();

  Reference subject();

  Optional<List<ResourceList>> contained();

  Optional<Date> statusDate();

  Optional<Code> language();

  Optional<String> startDate();

  Optional<CodeableConcept> achievementStatus();

  String resourceType();

  Optional<Reference> expressedBy();

  Optional<List<Goal_Target>> target();

  Optional<String> statusReason();

  Optional<List<Reference>> outcomeReference();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> addresses();

  CodeableConcept description();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  static ImmutableGoal.SubjectBuildStage builder() {
    return ImmutableGoal.builder();
  }
}

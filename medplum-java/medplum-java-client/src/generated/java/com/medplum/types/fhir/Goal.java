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
  CodeableConcept description();

  Optional<List<CodeableConcept>> category();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> startCodeableConcept();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> modifierExtension();

  Optional<String> startDate();

  Reference subject();

  Optional<CodeableConcept> priority();

  Optional<String> statusReason();

  Optional<List<Identifier>> identifier();

  Optional<List<Goal_Target>> target();

  Optional<Date> statusDate();

  Optional<Reference> expressedBy();

  Optional<List<Reference>> outcomeReference();

  Optional<Meta> meta();

  Optional<List<Reference>> addresses();

  Optional<CodeableConcept> achievementStatus();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> outcomeCode();

  String resourceType();

  Optional<GoalLifecyclestatus> lifecycleStatus();

  static ImmutableGoal.DescriptionBuildStage builder() {
    return ImmutableGoal.builder();
  }
}

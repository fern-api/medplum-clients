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
  Optional<List<Goal_Target>> target();

  Optional<CodeableConcept> achievementStatus();

  Optional<Date> statusDate();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  CodeableConcept description();

  Optional<GoalLifecyclestatus> lifecycleStatus();

  Optional<String> statusReason();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<List<CodeableConcept>> category();

  Optional<CodeableConcept> startCodeableConcept();

  Optional<List<Reference>> outcomeReference();

  String resourceType();

  Optional<CodeableConcept> priority();

  Optional<Reference> expressedBy();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> outcomeCode();

  Optional<Meta> meta();

  Optional<List<Reference>> addresses();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Reference subject();

  Optional<String> startDate();

  static ImmutableGoal.DescriptionBuildStage builder() {
    return ImmutableGoal.builder();
  }
}

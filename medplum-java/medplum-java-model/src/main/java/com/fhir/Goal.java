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
    as = ImmutableGoal.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Goal {
  Optional<Meta> meta();

  Optional<CodeableConcept> achievementStatus();

  Optional<CodeableConcept> startCodeableConcept();

  String resourceType();

  Optional<date> statusDate();

  Optional<Narrative> text();

  Optional<List<Reference>> addresses();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Goal_Target>> target();

  Optional<List<ResourceList>> contained();

  Optional<id> id();

  Optional<String> startDate();

  Optional<List<CodeableConcept>> outcomeCode();

  Optional<GoalLifecyclestatus> lifecycleStatus();

  Optional<List<Reference>> outcomeReference();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<Reference> expressedBy();

  Reference subject();

  Optional<List<CodeableConcept>> category();

  Optional<code> language();

  CodeableConcept description();

  Optional<CodeableConcept> priority();

  Optional<uri> implicitRules();

  Optional<String> statusReason();

  static ImmutableGoal.ResourceTypeBuildStage builder() {
    return ImmutableGoal.builder();
  }
}

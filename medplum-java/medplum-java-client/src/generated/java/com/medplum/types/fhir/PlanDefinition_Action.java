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
    as = ImmutablePlanDefinition_Action.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition_Action {
  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<String> prefix();

  Optional<List<CodeableConcept>> code();

  Optional<Duration> timingDuration();

  Optional<List<CodeableConcept>> reason();

  Optional<Period> timingPeriod();

  Optional<List<PlanDefinition_RelatedAction>> relatedAction();

  Optional<Timing> timingTiming();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<PlanDefinition_DynamicValue>> dynamicValue();

  Optional<CodeableConcept> type();

  Optional<String> title();

  Optional<List<DataRequirement>> output();

  Optional<String> definitionCanonical();

  Optional<Canonical> transform();

  Optional<List<Id>> goalId();

  Optional<Range> timingRange();

  Optional<Reference> subjectReference();

  Optional<Plandefinition_actionGroupingbehavior> groupingBehavior();

  Optional<String> timingDateTime();

  Optional<String> definitionUri();

  Optional<Code> priority();

  Optional<Plandefinition_actionSelectionbehavior> selectionBehavior();

  Optional<List<RelatedArtifact>> documentation();

  Optional<List<DataRequirement>> input();

  Optional<List<PlanDefinition_Participant>> participant();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<Plandefinition_actionRequiredbehavior> requiredBehavior();

  Optional<List<PlanDefinition_Action>> action();

  Optional<List<PlanDefinition_Condition>> condition();

  Optional<Age> timingAge();

  Optional<Plandefinition_actionPrecheckbehavior> precheckBehavior();

  Optional<String> textEquivalent();

  Optional<List<TriggerDefinition>> trigger();

  Optional<Plandefinition_actionCardinalitybehavior> cardinalityBehavior();

  static ImmutablePlanDefinition_Action.Builder builder() {
    return ImmutablePlanDefinition_Action.builder();
  }
}

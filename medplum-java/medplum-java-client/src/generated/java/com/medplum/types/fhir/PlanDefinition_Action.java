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
  Optional<String> definitionUri();

  Optional<List<DataRequirement>> input();

  Optional<Plandefinition_actionPrecheckbehavior> precheckBehavior();

  Optional<Reference> subjectReference();

  Optional<List<PlanDefinition_DynamicValue>> dynamicValue();

  Optional<List<CodeableConcept>> code();

  Optional<Age> timingAge();

  Optional<Code> priority();

  Optional<List<RelatedArtifact>> documentation();

  Optional<List<PlanDefinition_Action>> action();

  Optional<Plandefinition_actionSelectionbehavior> selectionBehavior();

  Optional<List<DataRequirement>> output();

  Optional<List<PlanDefinition_Condition>> condition();

  Optional<Range> timingRange();

  Optional<List<Id>> goalId();

  Optional<Plandefinition_actionCardinalitybehavior> cardinalityBehavior();

  Optional<List<CodeableConcept>> reason();

  Optional<List<PlanDefinition_RelatedAction>> relatedAction();

  Optional<List<PlanDefinition_Participant>> participant();

  Optional<String> title();

  Optional<Timing> timingTiming();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Canonical> transform();

  Optional<String> prefix();

  Optional<String> timingDateTime();

  Optional<String> id();

  Optional<String> textEquivalent();

  Optional<Period> timingPeriod();

  Optional<String> description();

  Optional<Plandefinition_actionGroupingbehavior> groupingBehavior();

  Optional<Duration> timingDuration();

  Optional<List<Extension>> extension();

  Optional<String> definitionCanonical();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<Plandefinition_actionRequiredbehavior> requiredBehavior();

  Optional<List<TriggerDefinition>> trigger();

  static ImmutablePlanDefinition_Action.Builder builder() {
    return ImmutablePlanDefinition_Action.builder();
  }
}

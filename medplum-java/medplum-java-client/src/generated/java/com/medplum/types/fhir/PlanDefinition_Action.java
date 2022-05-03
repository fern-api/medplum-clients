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
  Optional<List<Extension>> modifierExtension();

  Optional<Range> timingRange();

  Optional<Plandefinition_actionPrecheckbehavior> precheckBehavior();

  Optional<List<PlanDefinition_DynamicValue>> dynamicValue();

  Optional<List<RelatedArtifact>> documentation();

  Optional<String> title();

  Optional<String> prefix();

  Optional<List<Id>> goalId();

  Optional<List<Extension>> extension();

  Optional<String> timingDateTime();

  Optional<String> definitionUri();

  Optional<String> id();

  Optional<String> description();

  Optional<Age> timingAge();

  Optional<Timing> timingTiming();

  Optional<List<PlanDefinition_Condition>> condition();

  Optional<List<DataRequirement>> output();

  Optional<Plandefinition_actionRequiredbehavior> requiredBehavior();

  Optional<Canonical> transform();

  Optional<Code> priority();

  Optional<Reference> subjectReference();

  Optional<List<DataRequirement>> input();

  Optional<String> definitionCanonical();

  Optional<List<PlanDefinition_Action>> action();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Plandefinition_actionGroupingbehavior> groupingBehavior();

  Optional<Period> timingPeriod();

  Optional<List<TriggerDefinition>> trigger();

  Optional<List<CodeableConcept>> code();

  Optional<Duration> timingDuration();

  Optional<List<CodeableConcept>> reason();

  Optional<Plandefinition_actionSelectionbehavior> selectionBehavior();

  Optional<Plandefinition_actionCardinalitybehavior> cardinalityBehavior();

  Optional<String> textEquivalent();

  Optional<List<PlanDefinition_Participant>> participant();

  Optional<List<PlanDefinition_RelatedAction>> relatedAction();

  Optional<CodeableConcept> type();

  static ImmutablePlanDefinition_Action.Builder builder() {
    return ImmutablePlanDefinition_Action.builder();
  }
}

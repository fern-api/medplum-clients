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

  Optional<Plandefinition_actionGroupingbehavior> groupingBehavior();

  Optional<Reference> subjectReference();

  Optional<List<DataRequirement>> input();

  Optional<Code> priority();

  Optional<Period> timingPeriod();

  Optional<Plandefinition_actionCardinalitybehavior> cardinalityBehavior();

  Optional<String> description();

  Optional<List<PlanDefinition_Action>> action();

  Optional<String> textEquivalent();

  Optional<List<RelatedArtifact>> documentation();

  Optional<Plandefinition_actionSelectionbehavior> selectionBehavior();

  Optional<String> prefix();

  Optional<List<DataRequirement>> output();

  Optional<List<Extension>> extension();

  Optional<List<TriggerDefinition>> trigger();

  Optional<List<PlanDefinition_RelatedAction>> relatedAction();

  Optional<String> id();

  Optional<List<PlanDefinition_DynamicValue>> dynamicValue();

  Optional<Canonical> transform();

  Optional<Plandefinition_actionRequiredbehavior> requiredBehavior();

  Optional<String> timingDateTime();

  Optional<List<PlanDefinition_Condition>> condition();

  Optional<Age> timingAge();

  Optional<Duration> timingDuration();

  Optional<Range> timingRange();

  Optional<String> definitionCanonical();

  Optional<List<Extension>> modifierExtension();

  Optional<List<PlanDefinition_Participant>> participant();

  Optional<Timing> timingTiming();

  Optional<CodeableConcept> type();

  Optional<String> definitionUri();

  Optional<List<CodeableConcept>> reason();

  Optional<String> title();

  Optional<Plandefinition_actionPrecheckbehavior> precheckBehavior();

  Optional<List<CodeableConcept>> code();

  Optional<List<Id>> goalId();

  static ImmutablePlanDefinition_Action.Builder builder() {
    return ImmutablePlanDefinition_Action.builder();
  }
}

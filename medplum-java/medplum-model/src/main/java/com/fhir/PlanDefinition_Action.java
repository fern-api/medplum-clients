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
    as = ImmutablePlanDefinition_Action.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition_Action {
  Optional<Range> timingRange();

  Optional<List<PlanDefinition_DynamicValue>> dynamicValue();

  Optional<canonical> transform();

  Optional<List<Extension>> modifierExtension();

  Optional<List<PlanDefinition_RelatedAction>> relatedAction();

  Optional<List<PlanDefinition_Participant>> participant();

  Optional<Plandefinition_actionSelectionbehavior> selectionBehavior();

  Optional<CodeableConcept> type();

  Optional<String> id();

  Optional<List<CodeableConcept>> code();

  Optional<Reference> subjectReference();

  Optional<List<PlanDefinition_Condition>> condition();

  Optional<List<TriggerDefinition>> trigger();

  Optional<String> timingDateTime();

  Optional<Timing> timingTiming();

  Optional<String> textEquivalent();

  Optional<List<id>> goalId();

  Optional<Plandefinition_actionGroupingbehavior> groupingBehavior();

  Optional<Plandefinition_actionRequiredbehavior> requiredBehavior();

  Optional<List<DataRequirement>> input();

  Optional<Plandefinition_actionPrecheckbehavior> precheckBehavior();

  Optional<Period> timingPeriod();

  Optional<String> title();

  Optional<List<DataRequirement>> output();

  Optional<List<Extension>> extension();

  Optional<code> priority();

  Optional<String> definitionUri();

  Optional<Age> timingAge();

  Optional<String> description();

  Optional<List<RelatedArtifact>> documentation();

  Optional<List<CodeableConcept>> reason();

  Optional<String> definitionCanonical();

  Optional<Plandefinition_actionCardinalitybehavior> cardinalityBehavior();

  Optional<String> prefix();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Duration> timingDuration();

  Optional<List<PlanDefinition_Action>> action();

  static ImmutablePlanDefinition_Action.Builder builder() {
    return ImmutablePlanDefinition_Action.builder();
  }
}

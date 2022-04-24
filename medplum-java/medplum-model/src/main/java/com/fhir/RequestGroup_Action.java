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
    as = ImmutableRequestGroup_Action.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RequestGroup_Action {
  Optional<List<RequestGroup_Action>> action();

  Optional<String> textEquivalent();

  Optional<Age> timingAge();

  Optional<List<Extension>> modifierExtension();

  Optional<Range> timingRange();

  Optional<Period> timingPeriod();

  Optional<code> precheckBehavior();

  Optional<code> requiredBehavior();

  Optional<code> groupingBehavior();

  Optional<code> priority();

  Optional<List<Reference>> participant();

  Optional<String> id();

  Optional<String> description();

  Optional<List<RequestGroup_Condition>> condition();

  Optional<Duration> timingDuration();

  Optional<code> cardinalityBehavior();

  Optional<List<CodeableConcept>> code();

  Optional<List<Extension>> extension();

  Optional<code> selectionBehavior();

  Optional<String> timingDateTime();

  Optional<String> title();

  Optional<String> prefix();

  Optional<Timing> timingTiming();

  Optional<List<RequestGroup_RelatedAction>> relatedAction();

  Optional<Reference> resource();

  Optional<CodeableConcept> type();

  Optional<List<RelatedArtifact>> documentation();

  static ImmutableRequestGroup_Action.Builder builder() {
    return ImmutableRequestGroup_Action.builder();
  }
}

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
    as = ImmutableRequestGroup_Action.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RequestGroup_Action {
  Optional<List<RequestGroup_Condition>> condition();

  Optional<Period> timingPeriod();

  Optional<List<Extension>> extension();

  Optional<Code> selectionBehavior();

  Optional<Duration> timingDuration();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> precheckBehavior();

  Optional<CodeableConcept> type();

  Optional<String> id();

  Optional<Reference> resource();

  Optional<Code> requiredBehavior();

  Optional<List<RelatedArtifact>> documentation();

  Optional<Code> cardinalityBehavior();

  Optional<String> description();

  Optional<Range> timingRange();

  Optional<Timing> timingTiming();

  Optional<List<RequestGroup_RelatedAction>> relatedAction();

  Optional<String> prefix();

  Optional<Code> priority();

  Optional<Code> groupingBehavior();

  Optional<String> textEquivalent();

  Optional<String> timingDateTime();

  Optional<String> title();

  Optional<List<Reference>> participant();

  Optional<List<RequestGroup_Action>> action();

  Optional<Age> timingAge();

  Optional<List<CodeableConcept>> code();

  static ImmutableRequestGroup_Action.Builder builder() {
    return ImmutableRequestGroup_Action.builder();
  }
}

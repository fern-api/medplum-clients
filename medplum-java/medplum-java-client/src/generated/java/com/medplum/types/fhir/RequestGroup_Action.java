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
  Optional<List<CodeableConcept>> code();

  Optional<Code> requiredBehavior();

  Optional<String> description();

  Optional<Range> timingRange();

  Optional<List<RelatedArtifact>> documentation();

  Optional<CodeableConcept> type();

  Optional<Code> selectionBehavior();

  Optional<Code> cardinalityBehavior();

  Optional<List<RequestGroup_Condition>> condition();

  Optional<Period> timingPeriod();

  Optional<Code> priority();

  Optional<Code> precheckBehavior();

  Optional<Reference> resource();

  Optional<List<Reference>> participant();

  Optional<List<RequestGroup_RelatedAction>> relatedAction();

  Optional<Age> timingAge();

  Optional<List<RequestGroup_Action>> action();

  Optional<String> id();

  Optional<Code> groupingBehavior();

  Optional<String> timingDateTime();

  Optional<List<Extension>> modifierExtension();

  Optional<String> prefix();

  Optional<String> textEquivalent();

  Optional<List<Extension>> extension();

  Optional<Timing> timingTiming();

  Optional<Duration> timingDuration();

  Optional<String> title();

  static ImmutableRequestGroup_Action.Builder builder() {
    return ImmutableRequestGroup_Action.builder();
  }
}

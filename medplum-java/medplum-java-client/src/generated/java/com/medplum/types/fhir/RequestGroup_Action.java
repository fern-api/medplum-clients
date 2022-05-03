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
  Optional<String> title();

  Optional<Code> precheckBehavior();

  Optional<Period> timingPeriod();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<String> id();

  Optional<Age> timingAge();

  Optional<Code> cardinalityBehavior();

  Optional<Duration> timingDuration();

  Optional<String> description();

  Optional<List<RequestGroup_Condition>> condition();

  Optional<List<RelatedArtifact>> documentation();

  Optional<List<Reference>> participant();

  Optional<String> prefix();

  Optional<Timing> timingTiming();

  Optional<Code> groupingBehavior();

  Optional<Code> selectionBehavior();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> requiredBehavior();

  Optional<List<RequestGroup_Action>> action();

  Optional<String> timingDateTime();

  Optional<Code> priority();

  Optional<String> textEquivalent();

  Optional<Range> timingRange();

  Optional<Reference> resource();

  Optional<List<RequestGroup_RelatedAction>> relatedAction();

  Optional<List<CodeableConcept>> code();

  static ImmutableRequestGroup_Action.Builder builder() {
    return ImmutableRequestGroup_Action.builder();
  }
}

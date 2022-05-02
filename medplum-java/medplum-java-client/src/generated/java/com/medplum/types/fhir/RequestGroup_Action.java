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
  Optional<Timing> timingTiming();

  Optional<List<CodeableConcept>> code();

  Optional<String> id();

  Optional<Code> requiredBehavior();

  Optional<Range> timingRange();

  Optional<String> textEquivalent();

  Optional<List<Extension>> extension();

  Optional<List<RelatedArtifact>> documentation();

  Optional<String> timingDateTime();

  Optional<CodeableConcept> type();

  Optional<List<RequestGroup_Action>> action();

  Optional<Code> cardinalityBehavior();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> timingPeriod();

  Optional<Code> selectionBehavior();

  Optional<List<RequestGroup_RelatedAction>> relatedAction();

  Optional<List<Reference>> participant();

  Optional<Duration> timingDuration();

  Optional<Code> groupingBehavior();

  Optional<String> prefix();

  Optional<String> title();

  Optional<Age> timingAge();

  Optional<Code> priority();

  Optional<String> description();

  Optional<Reference> resource();

  Optional<List<RequestGroup_Condition>> condition();

  Optional<Code> precheckBehavior();

  static ImmutableRequestGroup_Action.Builder builder() {
    return ImmutableRequestGroup_Action.builder();
  }
}

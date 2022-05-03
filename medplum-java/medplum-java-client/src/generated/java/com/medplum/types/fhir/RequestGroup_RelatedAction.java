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
    as = ImmutableRequestGroup_RelatedAction.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RequestGroup_RelatedAction {
  Optional<Code> relationship();

  Optional<List<Extension>> extension();

  Optional<Range> offsetRange();

  Optional<Id> actionId();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Duration> offsetDuration();

  static ImmutableRequestGroup_RelatedAction.Builder builder() {
    return ImmutableRequestGroup_RelatedAction.builder();
  }
}

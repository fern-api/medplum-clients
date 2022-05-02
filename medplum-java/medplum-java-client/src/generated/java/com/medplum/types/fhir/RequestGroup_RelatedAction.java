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
  Optional<Range> offsetRange();

  Optional<Id> actionId();

  Optional<Duration> offsetDuration();

  Optional<List<Extension>> extension();

  Optional<Code> relationship();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  static ImmutableRequestGroup_RelatedAction.Builder builder() {
    return ImmutableRequestGroup_RelatedAction.builder();
  }
}

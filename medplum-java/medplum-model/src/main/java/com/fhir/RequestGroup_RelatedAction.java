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
    as = ImmutableRequestGroup_RelatedAction.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RequestGroup_RelatedAction {
  Optional<List<Extension>> extension();

  Optional<Duration> offsetDuration();

  Optional<code> relationship();

  Optional<String> id();

  Optional<id> actionId();

  Optional<Range> offsetRange();

  Optional<List<Extension>> modifierExtension();

  static ImmutableRequestGroup_RelatedAction.Builder builder() {
    return ImmutableRequestGroup_RelatedAction.builder();
  }
}

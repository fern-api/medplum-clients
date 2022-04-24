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
    as = ImmutableNarrative.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Narrative {
  Optional<String> id();

  Optional<List<Extension>> extension();

  xhtml div();

  Optional<NarrativeStatus> status();

  static ImmutableNarrative.DivBuildStage builder() {
    return ImmutableNarrative.builder();
  }
}

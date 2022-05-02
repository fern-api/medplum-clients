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
    as = ImmutableNarrative.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Narrative {
  Optional<NarrativeStatus> status();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Xhtml div();

  static ImmutableNarrative.DivBuildStage builder() {
    return ImmutableNarrative.builder();
  }
}

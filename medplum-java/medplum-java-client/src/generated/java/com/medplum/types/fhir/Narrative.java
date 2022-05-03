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
  Xhtml div();

  Optional<String> id();

  Optional<NarrativeStatus> status();

  Optional<List<Extension>> extension();

  static ImmutableNarrative.DivBuildStage builder() {
    return ImmutableNarrative.builder();
  }
}

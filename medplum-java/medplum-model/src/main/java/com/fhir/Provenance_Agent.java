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
    as = ImmutableProvenance_Agent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Provenance_Agent {
  Optional<String> id();

  Optional<List<CodeableConcept>> role();

  Optional<Reference> onBehalfOf();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Reference who();

  Optional<List<Extension>> modifierExtension();

  static ImmutableProvenance_Agent.WhoBuildStage builder() {
    return ImmutableProvenance_Agent.builder();
  }
}

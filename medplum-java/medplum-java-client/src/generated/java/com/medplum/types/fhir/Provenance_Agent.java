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
    as = ImmutableProvenance_Agent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Provenance_Agent {
  Optional<Reference> onBehalfOf();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> role();

  Optional<String> id();

  Reference who();

  Optional<CodeableConcept> type();

  static ImmutableProvenance_Agent.WhoBuildStage builder() {
    return ImmutableProvenance_Agent.builder();
  }
}

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
    as = ImmutableConceptMap_Unmapped.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ConceptMap_Unmapped {
  Optional<String> id();

  Optional<Code> code();

  Optional<String> display();

  Optional<Canonical> url();

  Optional<Conceptmap_unmappedMode> mode();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableConceptMap_Unmapped.Builder builder() {
    return ImmutableConceptMap_Unmapped.builder();
  }
}
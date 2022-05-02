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
    as = ImmutableComposition_Section.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Composition_Section {
  Optional<String> title();

  Optional<Code> mode();

  Optional<Reference> focus();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  Optional<List<Reference>> entry();

  Optional<String> id();

  Optional<List<Composition_Section>> section();

  Optional<List<Reference>> author();

  Optional<CodeableConcept> orderedBy();

  Optional<CodeableConcept> emptyReason();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  static ImmutableComposition_Section.Builder builder() {
    return ImmutableComposition_Section.builder();
  }
}

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
    as = ImmutableComposition_Section.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Composition_Section {
  Optional<CodeableConcept> orderedBy();

  Optional<CodeableConcept> emptyReason();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> focus();

  Optional<String> title();

  Optional<List<Reference>> author();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  Optional<code> mode();

  Optional<Narrative> text();

  Optional<List<Composition_Section>> section();

  Optional<List<Reference>> entry();

  Optional<String> id();

  static ImmutableComposition_Section.Builder builder() {
    return ImmutableComposition_Section.builder();
  }
}

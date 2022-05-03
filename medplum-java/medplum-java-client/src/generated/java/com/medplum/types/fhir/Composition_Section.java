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
  Optional<CodeableConcept> emptyReason();

  Optional<String> id();

  Optional<List<Reference>> entry();

  Optional<String> title();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> author();

  Optional<Reference> focus();

  Optional<Narrative> text();

  Optional<CodeableConcept> code();

  Optional<List<Composition_Section>> section();

  Optional<Code> mode();

  Optional<CodeableConcept> orderedBy();

  static ImmutableComposition_Section.Builder builder() {
    return ImmutableComposition_Section.builder();
  }
}

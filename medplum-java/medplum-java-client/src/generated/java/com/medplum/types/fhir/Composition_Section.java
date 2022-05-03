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
  Optional<List<Composition_Section>> section();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> emptyReason();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> focus();

  Optional<Code> mode();

  Optional<String> title();

  Optional<CodeableConcept> orderedBy();

  Optional<List<Reference>> author();

  Optional<List<Reference>> entry();

  Optional<Narrative> text();

  Optional<CodeableConcept> code();

  Optional<String> id();

  static ImmutableComposition_Section.Builder builder() {
    return ImmutableComposition_Section.builder();
  }
}

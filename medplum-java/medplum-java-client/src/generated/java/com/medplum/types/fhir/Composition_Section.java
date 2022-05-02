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
  Optional<List<Extension>> extension();

  Optional<List<Reference>> author();

  Optional<CodeableConcept> code();

  Optional<String> title();

  Optional<List<Reference>> entry();

  Optional<Narrative> text();

  Optional<CodeableConcept> emptyReason();

  Optional<Reference> focus();

  Optional<List<Composition_Section>> section();

  Optional<Code> mode();

  Optional<CodeableConcept> orderedBy();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableComposition_Section.Builder builder() {
    return ImmutableComposition_Section.builder();
  }
}

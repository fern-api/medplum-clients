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
    as = ImmutableComposition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Composition {
  CodeableConcept type();

  Optional<List<Composition_Section>> section();

  Optional<Reference> custodian();

  Optional<Reference> encounter();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> category();

  Optional<List<Composition_RelatesTo>> relatesTo();

  Optional<List<Composition_Event>> event();

  Optional<Meta> meta();

  Optional<CompositionStatus> status();

  Optional<List<ResourceList>> contained();

  Optional<String> title();

  Optional<List<Composition_Attester>> attester();

  Optional<Reference> subject();

  Optional<dateTime> date();

  Optional<code> confidentiality();

  Optional<code> language();

  Optional<id> id();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> identifier();

  List<Reference> author();

  Optional<uri> implicitRules();

  static ImmutableComposition.TypeBuildStage builder() {
    return ImmutableComposition.builder();
  }
}

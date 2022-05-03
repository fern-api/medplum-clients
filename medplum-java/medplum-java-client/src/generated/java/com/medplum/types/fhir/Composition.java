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
    as = ImmutableComposition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Composition {
  String resourceType();

  Optional<Id> id();

  Optional<Identifier> identifier();

  Optional<List<Extension>> extension();

  Optional<List<Composition_Event>> event();

  Optional<Narrative> text();

  Optional<Reference> custodian();

  Optional<List<Composition_RelatesTo>> relatesTo();

  Optional<List<Composition_Section>> section();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Composition_Attester>> attester();

  CodeableConcept type();

  Optional<Reference> subject();

  Optional<String> title();

  Optional<Code> language();

  Optional<CompositionStatus> status();

  Optional<DateTime> date();

  Optional<List<CodeableConcept>> category();

  List<Reference> author();

  Optional<Meta> meta();

  Optional<Reference> encounter();

  Optional<Uri> implicitRules();

  Optional<Code> confidentiality();

  Optional<List<ResourceList>> contained();

  static ImmutableComposition.ResourceTypeBuildStage builder() {
    return ImmutableComposition.builder();
  }
}

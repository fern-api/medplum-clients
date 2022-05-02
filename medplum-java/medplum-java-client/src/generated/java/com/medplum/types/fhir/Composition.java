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
  Optional<Reference> encounter();

  Optional<Code> language();

  Optional<List<CodeableConcept>> category();

  Optional<List<ResourceList>> contained();

  Optional<Code> confidentiality();

  Optional<List<Extension>> extension();

  Optional<Reference> custodian();

  Optional<CompositionStatus> status();

  Optional<List<Composition_RelatesTo>> relatesTo();

  Optional<Reference> subject();

  Optional<Identifier> identifier();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<DateTime> date();

  List<Reference> author();

  Optional<Id> id();

  Optional<List<Composition_Attester>> attester();

  Optional<List<Composition_Event>> event();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Composition_Section>> section();

  CodeableConcept type();

  Optional<String> title();

  static ImmutableComposition.ResourceTypeBuildStage builder() {
    return ImmutableComposition.builder();
  }
}

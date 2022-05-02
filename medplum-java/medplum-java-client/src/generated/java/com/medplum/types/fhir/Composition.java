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
  Optional<List<Composition_Event>> event();

  Optional<String> title();

  String resourceType();

  Optional<CompositionStatus> status();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Reference> encounter();

  Optional<Narrative> text();

  Optional<Id> id();

  Optional<Reference> subject();

  Optional<DateTime> date();

  Optional<List<Composition_RelatesTo>> relatesTo();

  Optional<List<Composition_Section>> section();

  Optional<Identifier> identifier();

  Optional<List<Composition_Attester>> attester();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> custodian();

  Optional<List<CodeableConcept>> category();

  Optional<Code> confidentiality();

  List<Reference> author();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  CodeableConcept type();

  static ImmutableComposition.ResourceTypeBuildStage builder() {
    return ImmutableComposition.builder();
  }
}

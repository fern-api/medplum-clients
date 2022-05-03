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
  Optional<Reference> subject();

  Optional<CompositionStatus> status();

  Optional<List<Composition_Event>> event();

  List<Reference> author();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<String> title();

  Optional<Code> confidentiality();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<List<Composition_Section>> section();

  Optional<List<CodeableConcept>> category();

  Optional<List<Composition_RelatesTo>> relatesTo();

  Optional<List<Extension>> extension();

  Optional<List<Composition_Attester>> attester();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<Identifier> identifier();

  Optional<DateTime> date();

  CodeableConcept type();

  Optional<Reference> encounter();

  Optional<Narrative> text();

  Optional<Reference> custodian();

  static ImmutableComposition.ResourceTypeBuildStage builder() {
    return ImmutableComposition.builder();
  }
}

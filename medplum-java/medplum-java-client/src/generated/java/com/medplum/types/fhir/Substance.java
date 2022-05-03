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
    as = ImmutableSubstance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Substance {
  Optional<List<CodeableConcept>> category();

  Optional<List<Substance_Ingredient>> ingredient();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<SubstanceStatus> status();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<String> description();

  String resourceType();

  Optional<Meta> meta();

  CodeableConcept code();

  Optional<List<Substance_Instance>> instance();

  static ImmutableSubstance.ResourceTypeBuildStage builder() {
    return ImmutableSubstance.builder();
  }
}

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
  Optional<List<Substance_Instance>> instance();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<Meta> meta();

  Optional<String> description();

  Optional<Uri> implicitRules();

  CodeableConcept code();

  Optional<Narrative> text();

  Optional<SubstanceStatus> status();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Substance_Ingredient>> ingredient();

  Optional<List<CodeableConcept>> category();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  static ImmutableSubstance.ResourceTypeBuildStage builder() {
    return ImmutableSubstance.builder();
  }
}

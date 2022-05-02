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
  Optional<List<Extension>> modifierExtension();

  Optional<SubstanceStatus> status();

  Optional<List<CodeableConcept>> category();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<String> description();

  Optional<List<Substance_Ingredient>> ingredient();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<List<Substance_Instance>> instance();

  CodeableConcept code();

  Optional<Code> language();

  String resourceType();

  Optional<Id> id();

  static ImmutableSubstance.CodeBuildStage builder() {
    return ImmutableSubstance.builder();
  }
}

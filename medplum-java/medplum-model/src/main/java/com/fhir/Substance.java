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
    as = ImmutableSubstance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Substance {
  Optional<id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<SubstanceStatus> status();

  Optional<Meta> meta();

  Optional<String> description();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  CodeableConcept code();

  Optional<List<Extension>> extension();

  Optional<uri> implicitRules();

  Optional<List<Substance_Ingredient>> ingredient();

  Optional<List<Substance_Instance>> instance();

  Optional<code> language();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<List<CodeableConcept>> category();

  static ImmutableSubstance.CodeBuildStage builder() {
    return ImmutableSubstance.builder();
  }
}

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
    as = ImmutableSubstanceSourceMaterial.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSourceMaterial {
  Optional<code> language();

  Optional<CodeableConcept> sourceMaterialClass();

  Optional<Narrative> text();

  String resourceType();

  Optional<Meta> meta();

  Optional<id> id();

  Optional<CodeableConcept> sourceMaterialType();

  Optional<Identifier> organismId();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> developmentStage();

  Optional<List<Extension>> extension();

  Optional<SubstanceSourceMaterial_Organism> organism();

  Optional<List<SubstanceSourceMaterial_PartDescription>> partDescription();

  Optional<List<Identifier>> parentSubstanceId();

  Optional<List<String>> parentSubstanceName();

  Optional<List<String>> geographicalLocation();

  Optional<List<SubstanceSourceMaterial_FractionDescription>> fractionDescription();

  Optional<uri> implicitRules();

  Optional<CodeableConcept> sourceMaterialState();

  Optional<List<CodeableConcept>> countryOfOrigin();

  Optional<String> organismName();

  static ImmutableSubstanceSourceMaterial.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceSourceMaterial.builder();
  }
}

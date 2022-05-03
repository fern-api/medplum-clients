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
    as = ImmutableSubstanceSourceMaterial.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSourceMaterial {
  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> geographicalLocation();

  Optional<SubstanceSourceMaterial_Organism> organism();

  Optional<Identifier> organismId();

  Optional<List<Identifier>> parentSubstanceId();

  Optional<CodeableConcept> sourceMaterialState();

  String resourceType();

  Optional<CodeableConcept> sourceMaterialType();

  Optional<CodeableConcept> developmentStage();

  Optional<List<CodeableConcept>> countryOfOrigin();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<List<SubstanceSourceMaterial_FractionDescription>> fractionDescription();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<CodeableConcept> sourceMaterialClass();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<SubstanceSourceMaterial_PartDescription>> partDescription();

  Optional<List<String>> parentSubstanceName();

  Optional<Code> language();

  Optional<String> organismName();

  static ImmutableSubstanceSourceMaterial.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceSourceMaterial.builder();
  }
}

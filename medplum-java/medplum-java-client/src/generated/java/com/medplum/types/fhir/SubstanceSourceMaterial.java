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
  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<Identifier> organismId();

  Optional<List<Identifier>> parentSubstanceId();

  Optional<CodeableConcept> sourceMaterialType();

  Optional<CodeableConcept> developmentStage();

  Optional<Id> id();

  Optional<List<SubstanceSourceMaterial_FractionDescription>> fractionDescription();

  Optional<String> organismName();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> countryOfOrigin();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> sourceMaterialState();

  Optional<List<String>> parentSubstanceName();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> sourceMaterialClass();

  Optional<List<SubstanceSourceMaterial_PartDescription>> partDescription();

  Optional<List<String>> geographicalLocation();

  Optional<SubstanceSourceMaterial_Organism> organism();

  static ImmutableSubstanceSourceMaterial.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceSourceMaterial.builder();
  }
}

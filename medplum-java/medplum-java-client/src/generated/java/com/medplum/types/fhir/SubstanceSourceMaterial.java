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
  Optional<CodeableConcept> sourceMaterialClass();

  Optional<List<Extension>> extension();

  Optional<List<String>> parentSubstanceName();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> id();

  Optional<List<SubstanceSourceMaterial_FractionDescription>> fractionDescription();

  Optional<String> organismName();

  Optional<SubstanceSourceMaterial_Organism> organism();

  Optional<CodeableConcept> developmentStage();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> countryOfOrigin();

  Optional<List<String>> geographicalLocation();

  Optional<List<Identifier>> parentSubstanceId();

  Optional<CodeableConcept> sourceMaterialState();

  Optional<CodeableConcept> sourceMaterialType();

  Optional<Narrative> text();

  Optional<Identifier> organismId();

  Optional<List<SubstanceSourceMaterial_PartDescription>> partDescription();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<Code> language();

  static ImmutableSubstanceSourceMaterial.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceSourceMaterial.builder();
  }
}

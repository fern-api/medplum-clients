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
  Optional<Meta> meta();

  Optional<List<String>> parentSubstanceName();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> parentSubstanceId();

  Optional<List<SubstanceSourceMaterial_PartDescription>> partDescription();

  Optional<Narrative> text();

  Optional<List<SubstanceSourceMaterial_FractionDescription>> fractionDescription();

  Optional<CodeableConcept> sourceMaterialType();

  Optional<List<CodeableConcept>> countryOfOrigin();

  Optional<List<String>> geographicalLocation();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> developmentStage();

  Optional<List<ResourceList>> contained();

  Optional<SubstanceSourceMaterial_Organism> organism();

  Optional<Code> language();

  Optional<CodeableConcept> sourceMaterialClass();

  Optional<Identifier> organismId();

  Optional<String> organismName();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> sourceMaterialState();

  Optional<Id> id();

  static ImmutableSubstanceSourceMaterial.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceSourceMaterial.builder();
  }
}

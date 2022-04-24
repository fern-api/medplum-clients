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
    as = ImmutableSubstanceSourceMaterial_Organism.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSourceMaterial_Organism {
  Optional<SubstanceSourceMaterial_Hybrid> hybrid();

  Optional<String> id();

  Optional<String> intraspecificDescription();

  Optional<CodeableConcept> family();

  Optional<CodeableConcept> species();

  Optional<List<Extension>> modifierExtension();

  Optional<SubstanceSourceMaterial_OrganismGeneral> organismGeneral();

  Optional<List<SubstanceSourceMaterial_Author>> author();

  Optional<CodeableConcept> intraspecificType();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> genus();

  static ImmutableSubstanceSourceMaterial_Organism.Builder builder() {
    return ImmutableSubstanceSourceMaterial_Organism.builder();
  }
}

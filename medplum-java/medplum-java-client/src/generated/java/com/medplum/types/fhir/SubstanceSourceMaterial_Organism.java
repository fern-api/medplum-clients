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
    as = ImmutableSubstanceSourceMaterial_Organism.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSourceMaterial_Organism {
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> species();

  Optional<List<Extension>> modifierExtension();

  Optional<String> intraspecificDescription();

  Optional<String> id();

  Optional<CodeableConcept> intraspecificType();

  Optional<CodeableConcept> family();

  Optional<SubstanceSourceMaterial_Hybrid> hybrid();

  Optional<CodeableConcept> genus();

  Optional<SubstanceSourceMaterial_OrganismGeneral> organismGeneral();

  Optional<List<SubstanceSourceMaterial_Author>> author();

  static ImmutableSubstanceSourceMaterial_Organism.Builder builder() {
    return ImmutableSubstanceSourceMaterial_Organism.builder();
  }
}

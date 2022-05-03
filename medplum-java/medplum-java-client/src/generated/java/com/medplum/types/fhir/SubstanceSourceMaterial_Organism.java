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
  Optional<String> id();

  Optional<CodeableConcept> genus();

  Optional<List<SubstanceSourceMaterial_Author>> author();

  Optional<CodeableConcept> species();

  Optional<String> intraspecificDescription();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> family();

  Optional<SubstanceSourceMaterial_Hybrid> hybrid();

  Optional<SubstanceSourceMaterial_OrganismGeneral> organismGeneral();

  Optional<CodeableConcept> intraspecificType();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceSourceMaterial_Organism.Builder builder() {
    return ImmutableSubstanceSourceMaterial_Organism.builder();
  }
}

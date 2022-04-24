package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMedicinalProductIngredient.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductIngredient {
  Optional<MedicinalProductIngredient_Substance> substance();

  Optional<code> language();

  CodeableConcept role();

  Optional<id> id();

  Optional<List<Reference>> manufacturer();

  Optional<Boolean> allergenicIndicator();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> implicitRules();

  Optional<Narrative> text();

  Optional<Identifier> identifier();

  Optional<List<Extension>> extension();

  Optional<List<MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  static ImmutableMedicinalProductIngredient.RoleBuildStage builder() {
    return ImmutableMedicinalProductIngredient.builder();
  }
}

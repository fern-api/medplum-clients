package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<Meta> meta();

  Optional<Id> id();

  Optional<Code> language();

  Optional<Boolean> allergenicIndicator();

  CodeableConcept role();

  Optional<MedicinalProductIngredient_Substance> substance();

  String resourceType();

  Optional<List<MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<Reference>> manufacturer();

  Optional<Uri> implicitRules();

  Optional<Identifier> identifier();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  static ImmutableMedicinalProductIngredient.RoleBuildStage builder() {
    return ImmutableMedicinalProductIngredient.builder();
  }
}

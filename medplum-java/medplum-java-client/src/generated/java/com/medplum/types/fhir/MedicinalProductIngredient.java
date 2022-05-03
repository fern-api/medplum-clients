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
  Optional<Boolean> allergenicIndicator();

  CodeableConcept role();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<MedicinalProductIngredient_Substance> substance();

  Optional<List<Reference>> manufacturer();

  Optional<Id> id();

  Optional<Identifier> identifier();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  static ImmutableMedicinalProductIngredient.RoleBuildStage builder() {
    return ImmutableMedicinalProductIngredient.builder();
  }
}

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
  Optional<Id> id();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  CodeableConcept role();

  Optional<List<Reference>> manufacturer();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> allergenicIndicator();

  Optional<List<ResourceList>> contained();

  Optional<Identifier> identifier();

  Optional<List<MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance();

  Optional<MedicinalProductIngredient_Substance> substance();

  static ImmutableMedicinalProductIngredient.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductIngredient.builder();
  }
}

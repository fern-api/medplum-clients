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
  String resourceType();

  Optional<Boolean> allergenicIndicator();

  Optional<Meta> meta();

  Optional<Identifier> identifier();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<MedicinalProductIngredient_SpecifiedSubstance>> specifiedSubstance();

  Optional<Narrative> text();

  Optional<MedicinalProductIngredient_Substance> substance();

  Optional<List<Reference>> manufacturer();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept role();

  Optional<Code> language();

  static ImmutableMedicinalProductIngredient.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductIngredient.builder();
  }
}

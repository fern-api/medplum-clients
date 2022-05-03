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
    as = ImmutableMedication_Ingredient.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Medication_Ingredient {
  Optional<List<Extension>> extension();

  Optional<Boolean> isActive();

  Optional<Ratio> strength();

  Optional<String> id();

  Optional<CodeableConcept> itemCodeableConcept();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> itemReference();

  static ImmutableMedication_Ingredient.Builder builder() {
    return ImmutableMedication_Ingredient.builder();
  }
}

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
    as = ImmutableMedication_Ingredient.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Medication_Ingredient {
  Optional<CodeableConcept> itemCodeableConcept();

  Optional<Ratio> strength();

  Optional<List<Extension>> extension();

  Optional<Reference> itemReference();

  Optional<Boolean> isActive();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  static ImmutableMedication_Ingredient.Builder builder() {
    return ImmutableMedication_Ingredient.builder();
  }
}

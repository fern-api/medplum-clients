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
    as = ImmutableMedicationKnowledge_Ingredient.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_Ingredient {
  Optional<Ratio> strength();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> itemCodeableConcept();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> itemReference();

  Optional<String> id();

  Optional<Boolean> isActive();

  static ImmutableMedicationKnowledge_Ingredient.Builder builder() {
    return ImmutableMedicationKnowledge_Ingredient.builder();
  }
}

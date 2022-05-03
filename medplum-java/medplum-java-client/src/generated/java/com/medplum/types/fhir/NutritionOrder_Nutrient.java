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
    as = ImmutableNutritionOrder_Nutrient.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NutritionOrder_Nutrient {
  Optional<String> id();

  Optional<CodeableConcept> modifier();

  Optional<List<Extension>> extension();

  Optional<Quantity> amount();

  Optional<List<Extension>> modifierExtension();

  static ImmutableNutritionOrder_Nutrient.Builder builder() {
    return ImmutableNutritionOrder_Nutrient.builder();
  }
}

package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableNutritionOrder_OralDiet.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NutritionOrder_OralDiet {
  Optional<List<Extension>> modifierExtension();

  Optional<String> instruction();

  Optional<List<Timing>> schedule();

  Optional<List<NutritionOrder_Nutrient>> nutrient();

  Optional<List<NutritionOrder_Texture>> texture();

  Optional<List<CodeableConcept>> type();

  Optional<List<CodeableConcept>> fluidConsistencyType();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableNutritionOrder_OralDiet.Builder builder() {
    return ImmutableNutritionOrder_OralDiet.builder();
  }
}

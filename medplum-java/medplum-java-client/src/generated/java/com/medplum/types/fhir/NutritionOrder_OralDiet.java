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
    as = ImmutableNutritionOrder_OralDiet.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NutritionOrder_OralDiet {
  Optional<List<Extension>> modifierExtension();

  Optional<List<NutritionOrder_Nutrient>> nutrient();

  Optional<List<Timing>> schedule();

  Optional<List<CodeableConcept>> type();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> fluidConsistencyType();

  Optional<String> id();

  Optional<List<NutritionOrder_Texture>> texture();

  Optional<String> instruction();

  static ImmutableNutritionOrder_OralDiet.Builder builder() {
    return ImmutableNutritionOrder_OralDiet.builder();
  }
}

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
    as = ImmutableNutritionOrder_Supplement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NutritionOrder_Supplement {
  Optional<List<Extension>> modifierExtension();

  Optional<String> instruction();

  Optional<String> productName();

  Optional<List<Timing>> schedule();

  Optional<String> id();

  Optional<Quantity> quantity();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  static ImmutableNutritionOrder_Supplement.Builder builder() {
    return ImmutableNutritionOrder_Supplement.builder();
  }
}

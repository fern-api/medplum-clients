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
    as = ImmutableNutritionOrder_Supplement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NutritionOrder_Supplement {
  Optional<String> productName();

  Optional<CodeableConcept> type();

  Optional<String> instruction();

  Optional<String> id();

  Optional<List<Timing>> schedule();

  Optional<List<Extension>> extension();

  Optional<Quantity> quantity();

  Optional<List<Extension>> modifierExtension();

  static ImmutableNutritionOrder_Supplement.Builder builder() {
    return ImmutableNutritionOrder_Supplement.builder();
  }
}

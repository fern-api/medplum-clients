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
  Optional<List<Timing>> schedule();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Quantity> quantity();

  Optional<String> productName();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<String> instruction();

  static ImmutableNutritionOrder_Supplement.Builder builder() {
    return ImmutableNutritionOrder_Supplement.builder();
  }
}

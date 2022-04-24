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
    as = ImmutableNutritionOrder_Administration.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NutritionOrder_Administration {
  Optional<Quantity> rateQuantity();

  Optional<String> id();

  Optional<Quantity> quantity();

  Optional<Timing> schedule();

  Optional<Ratio> rateRatio();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableNutritionOrder_Administration.Builder builder() {
    return ImmutableNutritionOrder_Administration.builder();
  }
}

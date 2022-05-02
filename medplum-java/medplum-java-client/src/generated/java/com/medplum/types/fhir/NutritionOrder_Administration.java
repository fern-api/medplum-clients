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
    as = ImmutableNutritionOrder_Administration.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NutritionOrder_Administration {
  Optional<Quantity> rateQuantity();

  Optional<Ratio> rateRatio();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Timing> schedule();

  Optional<List<Extension>> extension();

  Optional<Quantity> quantity();

  static ImmutableNutritionOrder_Administration.Builder builder() {
    return ImmutableNutritionOrder_Administration.builder();
  }
}

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
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> quantity();

  Optional<Ratio> rateRatio();

  Optional<Timing> schedule();

  Optional<List<Extension>> extension();

  Optional<Quantity> rateQuantity();

  static ImmutableNutritionOrder_Administration.Builder builder() {
    return ImmutableNutritionOrder_Administration.builder();
  }
}

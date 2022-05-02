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
    as = ImmutableNutritionOrder_Texture.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NutritionOrder_Texture {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<CodeableConcept> foodType();

  Optional<CodeableConcept> modifier();

  static ImmutableNutritionOrder_Texture.Builder builder() {
    return ImmutableNutritionOrder_Texture.builder();
  }
}

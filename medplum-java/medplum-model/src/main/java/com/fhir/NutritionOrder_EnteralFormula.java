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
    as = ImmutableNutritionOrder_EnteralFormula.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NutritionOrder_EnteralFormula {
  Optional<CodeableConcept> additiveType();

  Optional<String> additiveProductName();

  Optional<Quantity> caloricDensity();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<NutritionOrder_Administration>> administration();

  Optional<String> id();

  Optional<String> baseFormulaProductName();

  Optional<CodeableConcept> routeofAdministration();

  Optional<CodeableConcept> baseFormulaType();

  Optional<Quantity> maxVolumeToDeliver();

  Optional<String> administrationInstruction();

  static ImmutableNutritionOrder_EnteralFormula.Builder builder() {
    return ImmutableNutritionOrder_EnteralFormula.builder();
  }
}

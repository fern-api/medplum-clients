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
    as = ImmutableNutritionOrder_EnteralFormula.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NutritionOrder_EnteralFormula {
  Optional<CodeableConcept> routeofAdministration();

  Optional<Quantity> maxVolumeToDeliver();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> baseFormulaType();

  Optional<CodeableConcept> additiveType();

  Optional<String> additiveProductName();

  Optional<String> baseFormulaProductName();

  Optional<Quantity> caloricDensity();

  Optional<String> id();

  Optional<List<NutritionOrder_Administration>> administration();

  Optional<List<Extension>> extension();

  Optional<String> administrationInstruction();

  static ImmutableNutritionOrder_EnteralFormula.Builder builder() {
    return ImmutableNutritionOrder_EnteralFormula.builder();
  }
}

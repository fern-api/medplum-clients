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
  Optional<Quantity> maxVolumeToDeliver();

  Optional<CodeableConcept> baseFormulaType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Quantity> caloricDensity();

  Optional<List<NutritionOrder_Administration>> administration();

  Optional<CodeableConcept> additiveType();

  Optional<String> baseFormulaProductName();

  Optional<String> administrationInstruction();

  Optional<CodeableConcept> routeofAdministration();

  Optional<String> additiveProductName();

  Optional<String> id();

  static ImmutableNutritionOrder_EnteralFormula.Builder builder() {
    return ImmutableNutritionOrder_EnteralFormula.builder();
  }
}

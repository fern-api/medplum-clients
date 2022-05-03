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
  Optional<List<NutritionOrder_Administration>> administration();

  Optional<CodeableConcept> baseFormulaType();

  Optional<String> additiveProductName();

  Optional<String> baseFormulaProductName();

  Optional<String> administrationInstruction();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Quantity> maxVolumeToDeliver();

  Optional<CodeableConcept> additiveType();

  Optional<CodeableConcept> routeofAdministration();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> caloricDensity();

  static ImmutableNutritionOrder_EnteralFormula.Builder builder() {
    return ImmutableNutritionOrder_EnteralFormula.builder();
  }
}

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
    as = ImmutableMedicationAdministration_Dosage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationAdministration_Dosage {
  Optional<CodeableConcept> site();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> text();

  Optional<Quantity> dose();

  Optional<Ratio> rateRatio();

  Optional<String> id();

  Optional<CodeableConcept> route();

  Optional<CodeableConcept> method();

  Optional<Quantity> rateQuantity();

  static ImmutableMedicationAdministration_Dosage.Builder builder() {
    return ImmutableMedicationAdministration_Dosage.builder();
  }
}

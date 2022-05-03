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
    as = ImmutableMedicationAdministration_Dosage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationAdministration_Dosage {
  Optional<List<Extension>> extension();

  Optional<Quantity> rateQuantity();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> dose();

  Optional<CodeableConcept> site();

  Optional<Ratio> rateRatio();

  Optional<String> id();

  Optional<CodeableConcept> route();

  Optional<CodeableConcept> method();

  Optional<String> text();

  static ImmutableMedicationAdministration_Dosage.Builder builder() {
    return ImmutableMedicationAdministration_Dosage.builder();
  }
}

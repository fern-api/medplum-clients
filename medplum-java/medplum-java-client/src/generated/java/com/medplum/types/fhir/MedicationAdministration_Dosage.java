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
  Optional<CodeableConcept> method();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> site();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> route();

  Optional<Quantity> rateQuantity();

  Optional<Quantity> dose();

  Optional<String> text();

  Optional<Ratio> rateRatio();

  Optional<String> id();

  static ImmutableMedicationAdministration_Dosage.Builder builder() {
    return ImmutableMedicationAdministration_Dosage.builder();
  }
}

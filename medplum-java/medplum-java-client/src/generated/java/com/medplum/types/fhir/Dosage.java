package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableDosage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Dosage {
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> site();

  Optional<Quantity> maxDosePerLifetime();

  Optional<Boolean> asNeededBoolean();

  Optional<List<CodeableConcept>> additionalInstruction();

  Optional<CodeableConcept> method();

  Optional<Ratio> maxDosePerPeriod();

  Optional<Quantity> maxDosePerAdministration();

  Optional<CodeableConcept> asNeededCodeableConcept();

  Optional<String> patientInstruction();

  Optional<List<Dosage_DoseAndRate>> doseAndRate();

  Optional<Integer> sequence();

  Optional<String> text();

  Optional<CodeableConcept> route();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Timing> timing();

  static ImmutableDosage.Builder builder() {
    return ImmutableDosage.builder();
  }
}

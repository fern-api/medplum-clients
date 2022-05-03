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
  Optional<String> id();

  Optional<List<CodeableConcept>> additionalInstruction();

  Optional<Boolean> asNeededBoolean();

  Optional<Integer> sequence();

  Optional<String> patientInstruction();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Dosage_DoseAndRate>> doseAndRate();

  Optional<Quantity> maxDosePerAdministration();

  Optional<Timing> timing();

  Optional<CodeableConcept> route();

  Optional<Quantity> maxDosePerLifetime();

  Optional<CodeableConcept> method();

  Optional<Ratio> maxDosePerPeriod();

  Optional<String> text();

  Optional<CodeableConcept> asNeededCodeableConcept();

  Optional<CodeableConcept> site();

  static ImmutableDosage.Builder builder() {
    return ImmutableDosage.builder();
  }
}

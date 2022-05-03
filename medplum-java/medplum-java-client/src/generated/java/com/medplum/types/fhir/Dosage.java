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
  Optional<List<CodeableConcept>> additionalInstruction();

  Optional<List<Dosage_DoseAndRate>> doseAndRate();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> route();

  Optional<Boolean> asNeededBoolean();

  Optional<String> text();

  Optional<CodeableConcept> site();

  Optional<Integer> sequence();

  Optional<CodeableConcept> asNeededCodeableConcept();

  Optional<Ratio> maxDosePerPeriod();

  Optional<Quantity> maxDosePerAdministration();

  Optional<Timing> timing();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> maxDosePerLifetime();

  Optional<String> patientInstruction();

  Optional<String> id();

  Optional<CodeableConcept> method();

  static ImmutableDosage.Builder builder() {
    return ImmutableDosage.builder();
  }
}

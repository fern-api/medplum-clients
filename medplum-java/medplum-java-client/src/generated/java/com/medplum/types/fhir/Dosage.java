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
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> route();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> asNeededCodeableConcept();

  Optional<String> patientInstruction();

  Optional<Timing> timing();

  Optional<Quantity> maxDosePerAdministration();

  Optional<Boolean> asNeededBoolean();

  Optional<CodeableConcept> site();

  Optional<List<Dosage_DoseAndRate>> doseAndRate();

  Optional<Integer> sequence();

  Optional<String> id();

  Optional<Ratio> maxDosePerPeriod();

  Optional<List<CodeableConcept>> additionalInstruction();

  Optional<Quantity> maxDosePerLifetime();

  Optional<CodeableConcept> method();

  Optional<String> text();

  static ImmutableDosage.Builder builder() {
    return ImmutableDosage.builder();
  }
}

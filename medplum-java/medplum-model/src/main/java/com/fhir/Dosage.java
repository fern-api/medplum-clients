package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Integer> sequence();

  Optional<List<Dosage_DoseAndRate>> doseAndRate();

  Optional<List<CodeableConcept>> additionalInstruction();

  Optional<List<Extension>> modifierExtension();

  Optional<Ratio> maxDosePerPeriod();

  Optional<Quantity> maxDosePerAdministration();

  Optional<Boolean> asNeededBoolean();

  Optional<CodeableConcept> method();

  Optional<String> text();

  Optional<CodeableConcept> route();

  Optional<String> patientInstruction();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> asNeededCodeableConcept();

  Optional<CodeableConcept> site();

  Optional<Quantity> maxDosePerLifetime();

  Optional<String> id();

  Optional<Timing> timing();

  static ImmutableDosage.Builder builder() {
    return ImmutableDosage.builder();
  }
}

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
    as = ImmutableEncounter_Hospitalization.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Encounter_Hospitalization {
  Optional<CodeableConcept> admitSource();

  Optional<List<CodeableConcept>> specialArrangement();

  Optional<List<Extension>> extension();

  Optional<Identifier> preAdmissionIdentifier();

  Optional<List<CodeableConcept>> specialCourtesy();

  Optional<CodeableConcept> dischargeDisposition();

  Optional<Reference> destination();

  Optional<List<CodeableConcept>> dietPreference();

  Optional<Reference> origin();

  Optional<CodeableConcept> reAdmission();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableEncounter_Hospitalization.Builder builder() {
    return ImmutableEncounter_Hospitalization.builder();
  }
}

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
    as = ImmutableEncounter_Hospitalization.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Encounter_Hospitalization {
  Optional<List<CodeableConcept>> dietPreference();

  Optional<Reference> destination();

  Optional<CodeableConcept> dischargeDisposition();

  Optional<String> id();

  Optional<Identifier> preAdmissionIdentifier();

  Optional<List<CodeableConcept>> specialArrangement();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> admitSource();

  Optional<CodeableConcept> reAdmission();

  Optional<List<CodeableConcept>> specialCourtesy();

  Optional<Reference> origin();

  Optional<List<Extension>> modifierExtension();

  static ImmutableEncounter_Hospitalization.Builder builder() {
    return ImmutableEncounter_Hospitalization.builder();
  }
}

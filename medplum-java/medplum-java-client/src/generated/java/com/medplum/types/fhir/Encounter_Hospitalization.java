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
  Optional<Reference> origin();

  Optional<CodeableConcept> admitSource();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> specialCourtesy();

  Optional<Reference> destination();

  Optional<List<CodeableConcept>> specialArrangement();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> reAdmission();

  Optional<List<CodeableConcept>> dietPreference();

  Optional<Identifier> preAdmissionIdentifier();

  Optional<CodeableConcept> dischargeDisposition();

  static ImmutableEncounter_Hospitalization.Builder builder() {
    return ImmutableEncounter_Hospitalization.builder();
  }
}

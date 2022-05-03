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
  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> dietPreference();

  Optional<CodeableConcept> admitSource();

  Optional<Identifier> preAdmissionIdentifier();

  Optional<CodeableConcept> dischargeDisposition();

  Optional<Reference> origin();

  Optional<List<CodeableConcept>> specialArrangement();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> destination();

  Optional<List<CodeableConcept>> specialCourtesy();

  Optional<String> id();

  Optional<CodeableConcept> reAdmission();

  static ImmutableEncounter_Hospitalization.Builder builder() {
    return ImmutableEncounter_Hospitalization.builder();
  }
}

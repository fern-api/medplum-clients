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
    as = ImmutableClaim_Diagnosis.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Diagnosis {
  Optional<Reference> diagnosisReference();

  Optional<CodeableConcept> onAdmission();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> type();

  Optional<PositiveInt> sequence();

  Optional<CodeableConcept> diagnosisCodeableConcept();

  Optional<CodeableConcept> packageCode();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableClaim_Diagnosis.Builder builder() {
    return ImmutableClaim_Diagnosis.builder();
  }
}

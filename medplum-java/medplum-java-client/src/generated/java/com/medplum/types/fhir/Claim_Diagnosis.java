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
  Optional<String> id();

  Optional<CodeableConcept> diagnosisCodeableConcept();

  Optional<List<CodeableConcept>> type();

  Optional<List<Extension>> extension();

  Optional<Reference> diagnosisReference();

  Optional<PositiveInt> sequence();

  Optional<CodeableConcept> packageCode();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> onAdmission();

  static ImmutableClaim_Diagnosis.Builder builder() {
    return ImmutableClaim_Diagnosis.builder();
  }
}

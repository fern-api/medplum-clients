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
    as = ImmutableClaim_Diagnosis.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Diagnosis {
  Optional<Reference> diagnosisReference();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> onAdmission();

  Optional<List<CodeableConcept>> type();

  Optional<CodeableConcept> diagnosisCodeableConcept();

  Optional<CodeableConcept> packageCode();

  Optional<String> id();

  Optional<positiveInt> sequence();

  static ImmutableClaim_Diagnosis.Builder builder() {
    return ImmutableClaim_Diagnosis.builder();
  }
}

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
    as = ImmutableExplanationOfBenefit_Diagnosis.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Diagnosis {
  Optional<String> id();

  Optional<CodeableConcept> diagnosisCodeableConcept();

  Optional<CodeableConcept> packageCode();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> diagnosisReference();

  Optional<PositiveInt> sequence();

  Optional<List<CodeableConcept>> type();

  Optional<CodeableConcept> onAdmission();

  static ImmutableExplanationOfBenefit_Diagnosis.Builder builder() {
    return ImmutableExplanationOfBenefit_Diagnosis.builder();
  }
}

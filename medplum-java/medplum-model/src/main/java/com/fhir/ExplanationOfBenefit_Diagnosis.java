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
    as = ImmutableExplanationOfBenefit_Diagnosis.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Diagnosis {
  Optional<List<CodeableConcept>> type();

  Optional<Reference> diagnosisReference();

  Optional<String> id();

  Optional<positiveInt> sequence();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> diagnosisCodeableConcept();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> onAdmission();

  Optional<CodeableConcept> packageCode();

  static ImmutableExplanationOfBenefit_Diagnosis.Builder builder() {
    return ImmutableExplanationOfBenefit_Diagnosis.builder();
  }
}

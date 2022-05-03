package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableImmunizationRecommendation_Recommendation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImmunizationRecommendation_Recommendation {
  Optional<List<CodeableConcept>> contraindicatedVaccineCode();

  Optional<Double> doseNumberPositiveInt();

  Optional<Double> seriesDosesPositiveInt();

  Optional<List<CodeableConcept>> forecastReason();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept forecastStatus();

  Optional<String> id();

  Optional<List<CodeableConcept>> vaccineCode();

  Optional<List<ImmunizationRecommendation_DateCriterion>> dateCriterion();

  Optional<String> series();

  Optional<String> description();

  Optional<String> doseNumberString();

  Optional<CodeableConcept> targetDisease();

  Optional<List<Extension>> extension();

  Optional<String> seriesDosesString();

  Optional<List<Reference>> supportingPatientInformation();

  Optional<List<Reference>> supportingImmunization();

  static ImmutableImmunizationRecommendation_Recommendation.ForecastStatusBuildStage builder() {
    return ImmutableImmunizationRecommendation_Recommendation.builder();
  }
}

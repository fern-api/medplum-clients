package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<String> doseNumberString();

  Optional<List<Reference>> supportingImmunization();

  Optional<List<Extension>> extension();

  Optional<Double> seriesDosesPositiveInt();

  Optional<String> id();

  Optional<String> description();

  CodeableConcept forecastStatus();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ImmunizationRecommendation_DateCriterion>> dateCriterion();

  Optional<List<Reference>> supportingPatientInformation();

  Optional<List<CodeableConcept>> contraindicatedVaccineCode();

  Optional<List<CodeableConcept>> vaccineCode();

  Optional<CodeableConcept> targetDisease();

  Optional<List<CodeableConcept>> forecastReason();

  Optional<String> seriesDosesString();

  Optional<Double> doseNumberPositiveInt();

  Optional<String> series();

  static ImmutableImmunizationRecommendation_Recommendation.ForecastStatusBuildStage builder() {
    return ImmutableImmunizationRecommendation_Recommendation.builder();
  }
}

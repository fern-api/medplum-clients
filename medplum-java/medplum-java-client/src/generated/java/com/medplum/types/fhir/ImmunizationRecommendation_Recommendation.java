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
  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> supportingImmunization();

  Optional<List<CodeableConcept>> forecastReason();

  Optional<CodeableConcept> targetDisease();

  Optional<String> seriesDosesString();

  Optional<Double> seriesDosesPositiveInt();

  Optional<List<Extension>> extension();

  Optional<String> series();

  Optional<Double> doseNumberPositiveInt();

  CodeableConcept forecastStatus();

  Optional<String> doseNumberString();

  Optional<List<Reference>> supportingPatientInformation();

  Optional<List<ImmunizationRecommendation_DateCriterion>> dateCriterion();

  Optional<String> description();

  Optional<List<CodeableConcept>> vaccineCode();

  Optional<List<CodeableConcept>> contraindicatedVaccineCode();

  Optional<String> id();

  static ImmutableImmunizationRecommendation_Recommendation.ForecastStatusBuildStage builder() {
    return ImmutableImmunizationRecommendation_Recommendation.builder();
  }
}

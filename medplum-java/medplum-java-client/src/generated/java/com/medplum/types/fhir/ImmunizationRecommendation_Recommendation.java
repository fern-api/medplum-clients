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
  Optional<Double> doseNumberPositiveInt();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> supportingImmunization();

  Optional<String> seriesDosesString();

  Optional<Double> seriesDosesPositiveInt();

  CodeableConcept forecastStatus();

  Optional<List<ImmunizationRecommendation_DateCriterion>> dateCriterion();

  Optional<String> description();

  Optional<String> doseNumberString();

  Optional<CodeableConcept> targetDisease();

  Optional<String> series();

  Optional<List<Reference>> supportingPatientInformation();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> contraindicatedVaccineCode();

  Optional<List<CodeableConcept>> vaccineCode();

  Optional<List<CodeableConcept>> forecastReason();

  Optional<String> id();

  static ImmutableImmunizationRecommendation_Recommendation.ForecastStatusBuildStage builder() {
    return ImmutableImmunizationRecommendation_Recommendation.builder();
  }
}

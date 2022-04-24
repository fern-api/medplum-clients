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
    as = ImmutableImmunizationRecommendation_DateCriterion.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImmunizationRecommendation_DateCriterion {
  Optional<String> id();

  Optional<dateTime> value();

  Optional<List<Extension>> extension();

  CodeableConcept code();

  Optional<List<Extension>> modifierExtension();

  static ImmutableImmunizationRecommendation_DateCriterion.CodeBuildStage builder() {
    return ImmutableImmunizationRecommendation_DateCriterion.builder();
  }
}

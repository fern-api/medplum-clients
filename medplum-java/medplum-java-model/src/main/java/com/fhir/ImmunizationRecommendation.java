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
    as = ImmutableImmunizationRecommendation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImmunizationRecommendation {
  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  List<ImmunizationRecommendation_Recommendation> recommendation();

  String resourceType();

  Optional<Meta> meta();

  Optional<uri> implicitRules();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Reference> authority();

  Reference patient();

  Optional<code> language();

  Optional<dateTime> date();

  Optional<id> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableImmunizationRecommendation.ResourceTypeBuildStage builder() {
    return ImmutableImmunizationRecommendation.builder();
  }
}

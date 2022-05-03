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
    as = ImmutableImmunizationRecommendation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImmunizationRecommendation {
  List<ImmunizationRecommendation_Recommendation> recommendation();

  String resourceType();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> authority();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Reference patient();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<DateTime> date();

  static ImmutableImmunizationRecommendation.ResourceTypeBuildStage builder() {
    return ImmutableImmunizationRecommendation.builder();
  }
}

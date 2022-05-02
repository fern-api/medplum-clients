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
  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<Reference> authority();

  Optional<List<Extension>> modifierExtension();

  Reference patient();

  Optional<DateTime> date();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  List<ImmunizationRecommendation_Recommendation> recommendation();

  Optional<Id> id();

  static ImmutableImmunizationRecommendation.ResourceTypeBuildStage builder() {
    return ImmutableImmunizationRecommendation.builder();
  }
}

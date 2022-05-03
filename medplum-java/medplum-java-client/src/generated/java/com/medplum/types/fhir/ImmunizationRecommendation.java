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
  Reference patient();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  String resourceType();

  Optional<Reference> authority();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<DateTime> date();

  List<ImmunizationRecommendation_Recommendation> recommendation();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  static ImmutableImmunizationRecommendation.PatientBuildStage builder() {
    return ImmutableImmunizationRecommendation.builder();
  }
}

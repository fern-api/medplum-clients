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
    as = ImmutableAllergyIntolerance_Reaction.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AllergyIntolerance_Reaction {
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> substance();

  Optional<CodeableConcept> exposureRoute();

  Optional<List<Annotation>> note();

  Optional<Allergyintolerance_reactionSeverity> severity();

  Optional<String> description();

  List<CodeableConcept> manifestation();

  Optional<DateTime> onset();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableAllergyIntolerance_Reaction.Builder builder() {
    return ImmutableAllergyIntolerance_Reaction.builder();
  }
}

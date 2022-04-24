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
    as = ImmutableAllergyIntolerance_Reaction.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AllergyIntolerance_Reaction {
  Optional<String> id();

  List<CodeableConcept> manifestation();

  Optional<CodeableConcept> substance();

  Optional<CodeableConcept> exposureRoute();

  Optional<List<Annotation>> note();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<Allergyintolerance_reactionSeverity> severity();

  Optional<List<Extension>> modifierExtension();

  Optional<dateTime> onset();

  static ImmutableAllergyIntolerance_Reaction.Builder builder() {
    return ImmutableAllergyIntolerance_Reaction.builder();
  }
}

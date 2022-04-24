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
    as = ImmutableSubstance_Ingredient.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Substance_Ingredient {
  Optional<List<Extension>> modifierExtension();

  Optional<Reference> substanceReference();

  Optional<CodeableConcept> substanceCodeableConcept();

  Optional<List<Extension>> extension();

  Optional<Ratio> quantity();

  Optional<String> id();

  static ImmutableSubstance_Ingredient.Builder builder() {
    return ImmutableSubstance_Ingredient.builder();
  }
}

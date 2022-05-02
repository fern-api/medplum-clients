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
    as = ImmutableSubstance_Ingredient.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Substance_Ingredient {
  Optional<List<Extension>> modifierExtension();

  Optional<Reference> substanceReference();

  Optional<String> id();

  Optional<CodeableConcept> substanceCodeableConcept();

  Optional<List<Extension>> extension();

  Optional<Ratio> quantity();

  static ImmutableSubstance_Ingredient.Builder builder() {
    return ImmutableSubstance_Ingredient.builder();
  }
}
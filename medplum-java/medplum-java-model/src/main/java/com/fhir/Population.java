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
    as = ImmutablePopulation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Population {
  Optional<CodeableConcept> ageCodeableConcept();

  Optional<Range> ageRange();

  Optional<CodeableConcept> race();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> physiologicalCondition();

  Optional<CodeableConcept> gender();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutablePopulation.Builder builder() {
    return ImmutablePopulation.builder();
  }
}

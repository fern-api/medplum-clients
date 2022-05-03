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
    as = ImmutablePopulation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Population {
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> physiologicalCondition();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> ageCodeableConcept();

  Optional<Range> ageRange();

  Optional<CodeableConcept> race();

  Optional<String> id();

  Optional<CodeableConcept> gender();

  static ImmutablePopulation.Builder builder() {
    return ImmutablePopulation.builder();
  }
}

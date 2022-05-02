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
  Optional<CodeableConcept> physiologicalCondition();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Range> ageRange();

  Optional<CodeableConcept> ageCodeableConcept();

  Optional<CodeableConcept> gender();

  Optional<CodeableConcept> race();

  Optional<List<Extension>> extension();

  static ImmutablePopulation.Builder builder() {
    return ImmutablePopulation.builder();
  }
}

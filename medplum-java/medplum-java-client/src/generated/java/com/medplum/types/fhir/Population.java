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
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> physiologicalCondition();

  Optional<CodeableConcept> gender();

  Optional<CodeableConcept> ageCodeableConcept();

  Optional<String> id();

  Optional<CodeableConcept> race();

  Optional<Range> ageRange();

  Optional<List<Extension>> modifierExtension();

  static ImmutablePopulation.Builder builder() {
    return ImmutablePopulation.builder();
  }
}

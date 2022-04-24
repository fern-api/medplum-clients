package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMeasureReport_Population.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MeasureReport_Population {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Reference> subjectResults();

  Optional<Integer> count();

  Optional<CodeableConcept> code();

  static ImmutableMeasureReport_Population.Builder builder() {
    return ImmutableMeasureReport_Population.builder();
  }
}

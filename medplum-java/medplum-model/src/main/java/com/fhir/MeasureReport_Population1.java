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
    as = ImmutableMeasureReport_Population1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MeasureReport_Population1 {
  Optional<Integer> count();

  Optional<String> id();

  Optional<Reference> subjectResults();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  static ImmutableMeasureReport_Population1.Builder builder() {
    return ImmutableMeasureReport_Population1.builder();
  }
}

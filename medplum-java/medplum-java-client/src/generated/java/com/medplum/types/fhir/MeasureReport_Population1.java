package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> subjectResults();

  Optional<Integer> count();

  static ImmutableMeasureReport_Population1.Builder builder() {
    return ImmutableMeasureReport_Population1.builder();
  }
}

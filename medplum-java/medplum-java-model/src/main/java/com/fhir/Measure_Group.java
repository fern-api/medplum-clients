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
    as = ImmutableMeasure_Group.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Measure_Group {
  Optional<CodeableConcept> code();

  Optional<List<Measure_Stratifier>> stratifier();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Measure_Population>> population();

  Optional<String> description();

  Optional<String> id();

  static ImmutableMeasure_Group.Builder builder() {
    return ImmutableMeasure_Group.builder();
  }
}

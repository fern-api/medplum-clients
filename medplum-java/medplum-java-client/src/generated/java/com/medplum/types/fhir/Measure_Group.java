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
    as = ImmutableMeasure_Group.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Measure_Group {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Measure_Population>> population();

  Optional<List<Measure_Stratifier>> stratifier();

  Optional<String> id();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  static ImmutableMeasure_Group.Builder builder() {
    return ImmutableMeasure_Group.builder();
  }
}

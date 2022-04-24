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
    as = ImmutableMeasure_Population.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Measure_Population {
  Optional<CodeableConcept> code();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Expression criteria();

  Optional<String> id();

  static ImmutableMeasure_Population.CriteriaBuildStage builder() {
    return ImmutableMeasure_Population.builder();
  }
}

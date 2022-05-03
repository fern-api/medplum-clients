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
    as = ImmutableMeasure_Population.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Measure_Population {
  Optional<List<Extension>> extension();

  Expression criteria();

  Optional<String> id();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> code();

  static ImmutableMeasure_Population.CriteriaBuildStage builder() {
    return ImmutableMeasure_Population.builder();
  }
}

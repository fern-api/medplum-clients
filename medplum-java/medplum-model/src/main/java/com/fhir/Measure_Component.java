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
    as = ImmutableMeasure_Component.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Measure_Component {
  Optional<String> id();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Expression criteria();

  Optional<CodeableConcept> code();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMeasure_Component.CriteriaBuildStage builder() {
    return ImmutableMeasure_Component.builder();
  }
}

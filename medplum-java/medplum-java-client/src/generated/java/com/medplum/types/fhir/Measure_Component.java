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
    as = ImmutableMeasure_Component.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Measure_Component {
  Expression criteria();

  Optional<String> description();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  static ImmutableMeasure_Component.CriteriaBuildStage builder() {
    return ImmutableMeasure_Component.builder();
  }
}

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
    as = ImmutableMeasure_Stratifier.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Measure_Stratifier {
  Optional<CodeableConcept> code();

  Optional<List<Measure_Component>> component();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> description();

  Optional<Expression> criteria();

  static ImmutableMeasure_Stratifier.Builder builder() {
    return ImmutableMeasure_Stratifier.builder();
  }
}

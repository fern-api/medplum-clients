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
    as = ImmutableMeasure_Stratifier.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Measure_Stratifier {
  Optional<String> description();

  Optional<CodeableConcept> code();

  Optional<Expression> criteria();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Measure_Component>> component();

  static ImmutableMeasure_Stratifier.Builder builder() {
    return ImmutableMeasure_Stratifier.builder();
  }
}

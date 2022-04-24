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
    as = ImmutableExampleScenario_Alternative.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario_Alternative {
  Optional<List<Extension>> modifierExtension();

  Optional<List<ExampleScenario_Step>> step();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<String> title();

  Optional<markdown> description();

  static ImmutableExampleScenario_Alternative.Builder builder() {
    return ImmutableExampleScenario_Alternative.builder();
  }
}

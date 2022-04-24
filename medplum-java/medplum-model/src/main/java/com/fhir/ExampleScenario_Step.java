package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableExampleScenario_Step.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario_Step {
  Optional<List<Extension>> modifierExtension();

  Optional<List<ExampleScenario_Process>> process();

  Optional<List<Extension>> extension();

  Optional<Boolean> pause();

  Optional<String> id();

  Optional<List<ExampleScenario_Alternative>> alternative();

  Optional<ExampleScenario_Operation> operation();

  static ImmutableExampleScenario_Step.Builder builder() {
    return ImmutableExampleScenario_Step.builder();
  }
}

package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<ExampleScenario_Operation> operation();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> pause();

  Optional<List<Extension>> extension();

  Optional<List<ExampleScenario_Alternative>> alternative();

  Optional<String> id();

  Optional<List<ExampleScenario_Process>> process();

  static ImmutableExampleScenario_Step.Builder builder() {
    return ImmutableExampleScenario_Step.builder();
  }
}

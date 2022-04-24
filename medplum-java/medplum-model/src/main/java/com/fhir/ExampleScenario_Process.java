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
    as = ImmutableExampleScenario_Process.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario_Process {
  Optional<String> id();

  Optional<markdown> description();

  Optional<markdown> postConditions();

  Optional<List<ExampleScenario_Step>> step();

  Optional<String> title();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<markdown> preConditions();

  static ImmutableExampleScenario_Process.Builder builder() {
    return ImmutableExampleScenario_Process.builder();
  }
}

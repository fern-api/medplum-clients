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
    as = ImmutableExampleScenario_Process.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario_Process {
  Optional<Markdown> postConditions();

  Optional<String> title();

  Optional<Markdown> preConditions();

  Optional<List<ExampleScenario_Step>> step();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Markdown> description();

  static ImmutableExampleScenario_Process.Builder builder() {
    return ImmutableExampleScenario_Process.builder();
  }
}

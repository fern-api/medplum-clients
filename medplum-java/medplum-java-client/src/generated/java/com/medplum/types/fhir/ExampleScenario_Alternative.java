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
    as = ImmutableExampleScenario_Alternative.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario_Alternative {
  Optional<String> id();

  Optional<String> title();

  Optional<List<Extension>> modifierExtension();

  Optional<Markdown> description();

  Optional<List<Extension>> extension();

  Optional<List<ExampleScenario_Step>> step();

  static ImmutableExampleScenario_Alternative.Builder builder() {
    return ImmutableExampleScenario_Alternative.builder();
  }
}

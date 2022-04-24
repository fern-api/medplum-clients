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
    as = ImmutableExampleScenario_Actor.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario_Actor {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<markdown> description();

  Optional<Examplescenario_actorType> type();

  Optional<List<Extension>> extension();

  Optional<String> actorId();

  static ImmutableExampleScenario_Actor.Builder builder() {
    return ImmutableExampleScenario_Actor.builder();
  }
}

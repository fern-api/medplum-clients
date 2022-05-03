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
    as = ImmutableExampleScenario_Actor.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario_Actor {
  Optional<List<Extension>> extension();

  Optional<String> actorId();

  Optional<String> name();

  Optional<Markdown> description();

  Optional<Examplescenario_actorType> type();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableExampleScenario_Actor.Builder builder() {
    return ImmutableExampleScenario_Actor.builder();
  }
}

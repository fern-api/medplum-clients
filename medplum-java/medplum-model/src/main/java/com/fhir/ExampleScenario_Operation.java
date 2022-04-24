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
    as = ImmutableExampleScenario_Operation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario_Operation {
  Optional<String> type();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<markdown> description();

  Optional<ExampleScenario_ContainedInstance> response();

  Optional<ExampleScenario_ContainedInstance> request();

  Optional<String> receiver();

  Optional<String> initiator();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Boolean> initiatorActive();

  Optional<Boolean> receiverActive();

  Optional<String> number();

  static ImmutableExampleScenario_Operation.Builder builder() {
    return ImmutableExampleScenario_Operation.builder();
  }
}

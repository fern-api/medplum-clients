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
    as = ImmutableExampleScenario_Operation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario_Operation {
  Optional<String> type();

  Optional<Boolean> receiverActive();

  Optional<List<Extension>> modifierExtension();

  Optional<String> receiver();

  Optional<Markdown> description();

  Optional<Boolean> initiatorActive();

  Optional<ExampleScenario_ContainedInstance> response();

  Optional<String> name();

  Optional<ExampleScenario_ContainedInstance> request();

  Optional<String> initiator();

  Optional<String> number();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableExampleScenario_Operation.Builder builder() {
    return ImmutableExampleScenario_Operation.builder();
  }
}

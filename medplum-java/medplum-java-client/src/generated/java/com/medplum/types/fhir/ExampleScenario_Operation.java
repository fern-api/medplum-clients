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
  Optional<Boolean> initiatorActive();

  Optional<String> number();

  Optional<Boolean> receiverActive();

  Optional<ExampleScenario_ContainedInstance> request();

  Optional<String> name();

  Optional<List<Extension>> extension();

  Optional<String> receiver();

  Optional<Markdown> description();

  Optional<ExampleScenario_ContainedInstance> response();

  Optional<String> initiator();

  Optional<String> id();

  Optional<String> type();

  Optional<List<Extension>> modifierExtension();

  static ImmutableExampleScenario_Operation.Builder builder() {
    return ImmutableExampleScenario_Operation.builder();
  }
}

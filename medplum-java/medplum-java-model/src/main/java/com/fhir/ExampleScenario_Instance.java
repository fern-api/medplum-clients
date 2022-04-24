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
    as = ImmutableExampleScenario_Instance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario_Instance {
  Optional<code> resourceType();

  Optional<String> id();

  Optional<List<ExampleScenario_ContainedInstance>> containedInstance();

  Optional<List<Extension>> extension();

  Optional<List<ExampleScenario_Version>> version();

  Optional<List<Extension>> modifierExtension();

  Optional<markdown> description();

  Optional<String> resourceId();

  Optional<String> name();

  static ImmutableExampleScenario_Instance.Builder builder() {
    return ImmutableExampleScenario_Instance.builder();
  }
}

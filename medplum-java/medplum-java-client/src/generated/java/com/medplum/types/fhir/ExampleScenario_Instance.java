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
    as = ImmutableExampleScenario_Instance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario_Instance {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ExampleScenario_ContainedInstance>> containedInstance();

  Optional<String> name();

  Optional<List<ExampleScenario_Version>> version();

  Optional<String> id();

  Optional<String> resourceId();

  Optional<Markdown> description();

  Optional<Code> resourceType();

  static ImmutableExampleScenario_Instance.Builder builder() {
    return ImmutableExampleScenario_Instance.builder();
  }
}

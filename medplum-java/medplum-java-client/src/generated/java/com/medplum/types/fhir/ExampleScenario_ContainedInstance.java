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
    as = ImmutableExampleScenario_ContainedInstance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario_ContainedInstance {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> resourceId();

  Optional<String> versionId();

  Optional<List<Extension>> modifierExtension();

  static ImmutableExampleScenario_ContainedInstance.Builder builder() {
    return ImmutableExampleScenario_ContainedInstance.builder();
  }
}

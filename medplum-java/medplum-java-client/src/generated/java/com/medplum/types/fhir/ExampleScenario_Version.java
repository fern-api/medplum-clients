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
    as = ImmutableExampleScenario_Version.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExampleScenario_Version {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Markdown> description();

  Optional<String> id();

  Optional<String> versionId();

  static ImmutableExampleScenario_Version.Builder builder() {
    return ImmutableExampleScenario_Version.builder();
  }
}

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
    as = ImmutableTestScript_Metadata.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Metadata {
  Optional<List<TestScript_Link>> link();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  List<TestScript_Capability> capability();

  static ImmutableTestScript_Metadata.Builder builder() {
    return ImmutableTestScript_Metadata.builder();
  }
}

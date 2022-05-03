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
    as = ImmutableTestScript_Metadata.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Metadata {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<TestScript_Link>> link();

  List<TestScript_Capability> capability();

  Optional<String> id();

  static ImmutableTestScript_Metadata.Builder builder() {
    return ImmutableTestScript_Metadata.builder();
  }
}

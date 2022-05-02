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
    as = ImmutableTestScript_RequestHeader.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_RequestHeader {
  Optional<String> value();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<String> field();

  Optional<List<Extension>> extension();

  static ImmutableTestScript_RequestHeader.Builder builder() {
    return ImmutableTestScript_RequestHeader.builder();
  }
}

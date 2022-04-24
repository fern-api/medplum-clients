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
    as = ImmutableTestScript_RequestHeader.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_RequestHeader {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> field();

  Optional<String> value();

  static ImmutableTestScript_RequestHeader.Builder builder() {
    return ImmutableTestScript_RequestHeader.builder();
  }
}

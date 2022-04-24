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
    as = ImmutableTestScript_Link.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Link {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> url();

  static ImmutableTestScript_Link.Builder builder() {
    return ImmutableTestScript_Link.builder();
  }
}

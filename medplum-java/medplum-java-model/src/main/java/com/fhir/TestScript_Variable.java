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
    as = ImmutableTestScript_Variable.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Variable {
  Optional<id> sourceId();

  Optional<String> id();

  Optional<String> description();

  Optional<String> headerField();

  Optional<String> expression();

  Optional<String> name();

  Optional<String> defaultValue();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> hint();

  Optional<String> path();

  static ImmutableTestScript_Variable.Builder builder() {
    return ImmutableTestScript_Variable.builder();
  }
}

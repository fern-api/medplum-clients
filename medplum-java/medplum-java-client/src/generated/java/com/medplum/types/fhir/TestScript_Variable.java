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
    as = ImmutableTestScript_Variable.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Variable {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<String> defaultValue();

  Optional<String> id();

  Optional<Id> sourceId();

  Optional<String> description();

  Optional<String> path();

  Optional<String> hint();

  Optional<String> expression();

  Optional<String> headerField();

  static ImmutableTestScript_Variable.Builder builder() {
    return ImmutableTestScript_Variable.builder();
  }
}

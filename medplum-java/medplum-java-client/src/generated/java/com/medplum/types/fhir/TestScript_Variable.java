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
  Optional<String> defaultValue();

  Optional<String> path();

  Optional<Id> sourceId();

  Optional<String> headerField();

  Optional<String> id();

  Optional<String> description();

  Optional<String> expression();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<String> hint();

  static ImmutableTestScript_Variable.Builder builder() {
    return ImmutableTestScript_Variable.builder();
  }
}

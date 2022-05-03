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

  Optional<String> description();

  Optional<String> hint();

  Optional<String> path();

  Optional<String> name();

  Optional<List<Extension>> extension();

  Optional<String> expression();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> headerField();

  Optional<Id> sourceId();

  static ImmutableTestScript_Variable.Builder builder() {
    return ImmutableTestScript_Variable.builder();
  }
}

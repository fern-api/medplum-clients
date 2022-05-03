package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableParameterDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ParameterDefinition {
  Optional<Code> use();

  Optional<Code> type();

  Optional<Canonical> profile();

  Optional<Code> name();

  Optional<Integer> min();

  Optional<String> documentation();

  Optional<List<Extension>> extension();

  Optional<String> max();

  Optional<String> id();

  static ImmutableParameterDefinition.Builder builder() {
    return ImmutableParameterDefinition.builder();
  }
}

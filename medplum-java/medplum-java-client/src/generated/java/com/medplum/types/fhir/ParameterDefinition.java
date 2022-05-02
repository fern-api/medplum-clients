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
  Optional<Code> name();

  Optional<Integer> min();

  Optional<String> documentation();

  Optional<String> max();

  Optional<String> id();

  Optional<Code> type();

  Optional<Canonical> profile();

  Optional<Code> use();

  Optional<List<Extension>> extension();

  static ImmutableParameterDefinition.Builder builder() {
    return ImmutableParameterDefinition.builder();
  }
}

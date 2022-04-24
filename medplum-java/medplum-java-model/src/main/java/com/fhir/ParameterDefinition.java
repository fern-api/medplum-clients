package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<code> use();

  Optional<List<Extension>> extension();

  Optional<code> type();

  Optional<code> name();

  Optional<String> id();

  Optional<Integer> min();

  Optional<canonical> profile();

  Optional<String> max();

  Optional<String> documentation();

  static ImmutableParameterDefinition.Builder builder() {
    return ImmutableParameterDefinition.builder();
  }
}

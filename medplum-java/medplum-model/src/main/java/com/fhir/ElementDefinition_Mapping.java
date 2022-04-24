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
    as = ImmutableElementDefinition_Mapping.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Mapping {
  Optional<id> identity();

  Optional<List<Extension>> extension();

  Optional<code> language();

  Optional<String> map();

  Optional<String> id();

  Optional<String> comment();

  Optional<List<Extension>> modifierExtension();

  static ImmutableElementDefinition_Mapping.Builder builder() {
    return ImmutableElementDefinition_Mapping.builder();
  }
}

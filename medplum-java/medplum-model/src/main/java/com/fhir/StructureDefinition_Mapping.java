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
    as = ImmutableStructureDefinition_Mapping.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureDefinition_Mapping {
  Optional<List<Extension>> modifierExtension();

  Optional<String> comment();

  Optional<List<Extension>> extension();

  Optional<uri> uri();

  Optional<String> name();

  Optional<id> identity();

  Optional<String> id();

  static ImmutableStructureDefinition_Mapping.Builder builder() {
    return ImmutableStructureDefinition_Mapping.builder();
  }
}

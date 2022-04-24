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
    as = ImmutableStructureMap_Dependent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Dependent {
  Optional<List<String>> variable();

  Optional<String> id();

  Optional<id> name();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableStructureMap_Dependent.Builder builder() {
    return ImmutableStructureMap_Dependent.builder();
  }
}

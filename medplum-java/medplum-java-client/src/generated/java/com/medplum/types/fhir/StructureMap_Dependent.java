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
    as = ImmutableStructureMap_Dependent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Dependent {
  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> variable();

  Optional<String> id();

  Optional<Id> name();

  Optional<List<Extension>> extension();

  static ImmutableStructureMap_Dependent.Builder builder() {
    return ImmutableStructureMap_Dependent.builder();
  }
}

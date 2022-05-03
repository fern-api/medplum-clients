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
    as = ImmutableStructureDefinition_Mapping.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureDefinition_Mapping {
  Optional<String> id();

  Optional<Uri> uri();

  Optional<Id> identity();

  Optional<String> name();

  Optional<List<Extension>> extension();

  Optional<String> comment();

  Optional<List<Extension>> modifierExtension();

  static ImmutableStructureDefinition_Mapping.Builder builder() {
    return ImmutableStructureDefinition_Mapping.builder();
  }
}

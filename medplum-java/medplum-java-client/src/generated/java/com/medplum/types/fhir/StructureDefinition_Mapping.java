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

  Optional<List<Extension>> extension();

  Optional<Uri> uri();

  Optional<List<Extension>> modifierExtension();

  Optional<String> comment();

  Optional<String> name();

  Optional<Id> identity();

  static ImmutableStructureDefinition_Mapping.Builder builder() {
    return ImmutableStructureDefinition_Mapping.builder();
  }
}

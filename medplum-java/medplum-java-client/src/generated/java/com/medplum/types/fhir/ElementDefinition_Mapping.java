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
    as = ImmutableElementDefinition_Mapping.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Mapping {
  Optional<String> id();

  Optional<String> map();

  Optional<String> comment();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> identity();

  static ImmutableElementDefinition_Mapping.Builder builder() {
    return ImmutableElementDefinition_Mapping.builder();
  }
}

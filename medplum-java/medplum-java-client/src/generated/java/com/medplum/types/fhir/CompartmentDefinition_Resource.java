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
    as = ImmutableCompartmentDefinition_Resource.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CompartmentDefinition_Resource {
  Optional<String> id();

  Optional<String> documentation();

  Optional<List<String>> param();

  Optional<Code> code();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableCompartmentDefinition_Resource.Builder builder() {
    return ImmutableCompartmentDefinition_Resource.builder();
  }
}

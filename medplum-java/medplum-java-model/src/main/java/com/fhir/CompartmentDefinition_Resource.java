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
    as = ImmutableCompartmentDefinition_Resource.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CompartmentDefinition_Resource {
  Optional<List<String>> param();

  Optional<code> code();

  Optional<List<Extension>> modifierExtension();

  Optional<String> documentation();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableCompartmentDefinition_Resource.Builder builder() {
    return ImmutableCompartmentDefinition_Resource.builder();
  }
}

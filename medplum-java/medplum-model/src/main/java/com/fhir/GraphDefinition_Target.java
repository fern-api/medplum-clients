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
    as = ImmutableGraphDefinition_Target.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface GraphDefinition_Target {
  Optional<List<Extension>> modifierExtension();

  Optional<List<GraphDefinition_Compartment>> compartment();

  Optional<List<GraphDefinition_Link>> link();

  Optional<String> id();

  Optional<code> type();

  Optional<List<Extension>> extension();

  Optional<String> params();

  Optional<canonical> profile();

  static ImmutableGraphDefinition_Target.Builder builder() {
    return ImmutableGraphDefinition_Target.builder();
  }
}

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
    as = ImmutableGraphDefinition_Target.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface GraphDefinition_Target {
  Optional<String> id();

  Optional<Code> type();

  Optional<String> params();

  Optional<Canonical> profile();

  Optional<List<GraphDefinition_Link>> link();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<GraphDefinition_Compartment>> compartment();

  static ImmutableGraphDefinition_Target.Builder builder() {
    return ImmutableGraphDefinition_Target.builder();
  }
}

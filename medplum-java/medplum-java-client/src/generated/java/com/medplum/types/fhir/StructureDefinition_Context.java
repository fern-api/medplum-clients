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
    as = ImmutableStructureDefinition_Context.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureDefinition_Context {
  Optional<List<Extension>> extension();

  Optional<String> expression();

  Optional<Structuredefinition_contextType> type();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  static ImmutableStructureDefinition_Context.Builder builder() {
    return ImmutableStructureDefinition_Context.builder();
  }
}

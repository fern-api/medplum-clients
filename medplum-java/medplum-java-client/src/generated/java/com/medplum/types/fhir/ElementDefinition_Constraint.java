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
    as = ImmutableElementDefinition_Constraint.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Constraint {
  Optional<List<Extension>> modifierExtension();

  Optional<String> xpath();

  Optional<Id> key();

  Optional<List<Extension>> extension();

  Optional<String> requirements();

  Optional<String> expression();

  Optional<String> human();

  Optional<Canonical> source();

  Optional<String> id();

  Optional<Elementdefinition_constraintSeverity> severity();

  static ImmutableElementDefinition_Constraint.Builder builder() {
    return ImmutableElementDefinition_Constraint.builder();
  }
}

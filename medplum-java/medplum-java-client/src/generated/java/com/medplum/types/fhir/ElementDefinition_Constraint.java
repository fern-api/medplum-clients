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
  Optional<String> human();

  Optional<List<Extension>> extension();

  Optional<String> expression();

  Optional<String> id();

  Optional<Canonical> source();

  Optional<Id> key();

  Optional<List<Extension>> modifierExtension();

  Optional<Elementdefinition_constraintSeverity> severity();

  Optional<String> xpath();

  Optional<String> requirements();

  static ImmutableElementDefinition_Constraint.Builder builder() {
    return ImmutableElementDefinition_Constraint.builder();
  }
}

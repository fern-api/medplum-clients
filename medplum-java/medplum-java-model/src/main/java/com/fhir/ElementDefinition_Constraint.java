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
    as = ImmutableElementDefinition_Constraint.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Constraint {
  Optional<id> key();

  Optional<String> expression();

  Optional<String> id();

  Optional<String> requirements();

  Optional<List<Extension>> modifierExtension();

  Optional<canonical> source();

  Optional<String> xpath();

  Optional<Elementdefinition_constraintSeverity> severity();

  Optional<String> human();

  Optional<List<Extension>> extension();

  static ImmutableElementDefinition_Constraint.Builder builder() {
    return ImmutableElementDefinition_Constraint.builder();
  }
}

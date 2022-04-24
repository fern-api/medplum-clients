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
    as = ImmutableConceptMap_DependsOn.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ConceptMap_DependsOn {
  Optional<List<Extension>> modifierExtension();

  Optional<uri> property();

  Optional<String> value();

  Optional<String> id();

  Optional<canonical> system();

  Optional<List<Extension>> extension();

  Optional<String> display();

  static ImmutableConceptMap_DependsOn.Builder builder() {
    return ImmutableConceptMap_DependsOn.builder();
  }
}

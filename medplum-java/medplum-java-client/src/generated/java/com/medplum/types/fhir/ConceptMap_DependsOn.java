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
    as = ImmutableConceptMap_DependsOn.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ConceptMap_DependsOn {
  Optional<String> value();

  Optional<Uri> property();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Canonical> system();

  Optional<String> display();

  static ImmutableConceptMap_DependsOn.Builder builder() {
    return ImmutableConceptMap_DependsOn.builder();
  }
}

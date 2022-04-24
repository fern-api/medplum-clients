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
    as = ImmutableConceptMap_Target.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ConceptMap_Target {
  Optional<String> id();

  Optional<code> code();

  Optional<List<Extension>> extension();

  Optional<String> comment();

  Optional<List<ConceptMap_DependsOn>> product();

  Optional<List<Extension>> modifierExtension();

  Optional<Conceptmap_targetEquivalence> equivalence();

  Optional<List<ConceptMap_DependsOn>> dependsOn();

  Optional<String> display();

  static ImmutableConceptMap_Target.Builder builder() {
    return ImmutableConceptMap_Target.builder();
  }
}

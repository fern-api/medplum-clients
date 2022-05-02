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
    as = ImmutableConceptMap_Target.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ConceptMap_Target {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<ConceptMap_DependsOn>> dependsOn();

  Optional<List<Extension>> extension();

  Optional<Code> code();

  Optional<String> display();

  Optional<Conceptmap_targetEquivalence> equivalence();

  Optional<String> comment();

  Optional<List<ConceptMap_DependsOn>> product();

  static ImmutableConceptMap_Target.Builder builder() {
    return ImmutableConceptMap_Target.builder();
  }
}

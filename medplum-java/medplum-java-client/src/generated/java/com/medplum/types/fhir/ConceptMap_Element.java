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
    as = ImmutableConceptMap_Element.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ConceptMap_Element {
  Optional<Code> code();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<String> display();

  Optional<List<ConceptMap_Target>> target();

  static ImmutableConceptMap_Element.Builder builder() {
    return ImmutableConceptMap_Element.builder();
  }
}

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
    as = ImmutableConceptMap_Element.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ConceptMap_Element {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<code> code();

  Optional<List<ConceptMap_Target>> target();

  Optional<String> display();

  static ImmutableConceptMap_Element.Builder builder() {
    return ImmutableConceptMap_Element.builder();
  }
}

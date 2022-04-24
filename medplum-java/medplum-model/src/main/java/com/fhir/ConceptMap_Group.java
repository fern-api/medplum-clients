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
    as = ImmutableConceptMap_Group.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ConceptMap_Group {
  Optional<ConceptMap_Unmapped> unmapped();

  Optional<String> targetVersion();

  List<ConceptMap_Element> element();

  Optional<uri> source();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> sourceVersion();

  Optional<uri> target();

  static ImmutableConceptMap_Group.Builder builder() {
    return ImmutableConceptMap_Group.builder();
  }
}

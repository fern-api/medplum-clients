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
    as = ImmutableConceptMap_Group.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ConceptMap_Group {
  Optional<Uri> source();

  Optional<ConceptMap_Unmapped> unmapped();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> target();

  List<ConceptMap_Element> element();

  Optional<String> sourceVersion();

  Optional<String> targetVersion();

  static ImmutableConceptMap_Group.Builder builder() {
    return ImmutableConceptMap_Group.builder();
  }
}

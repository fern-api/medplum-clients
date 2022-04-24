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
    as = ImmutableSubstancePolymer_StructuralRepresentation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstancePolymer_StructuralRepresentation {
  Optional<List<Extension>> extension();

  Optional<String> representation();

  Optional<String> id();

  Optional<Attachment> attachment();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  static ImmutableSubstancePolymer_StructuralRepresentation.Builder builder() {
    return ImmutableSubstancePolymer_StructuralRepresentation.builder();
  }
}

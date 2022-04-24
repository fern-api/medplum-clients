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
    as = ImmutableSubstanceReferenceInformation_GeneElement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceReferenceInformation_GeneElement {
  Optional<String> id();

  Optional<List<Reference>> source();

  Optional<Identifier> element();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  static ImmutableSubstanceReferenceInformation_GeneElement.Builder builder() {
    return ImmutableSubstanceReferenceInformation_GeneElement.builder();
  }
}

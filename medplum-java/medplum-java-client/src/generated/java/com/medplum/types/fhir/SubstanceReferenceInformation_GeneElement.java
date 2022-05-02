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
    as = ImmutableSubstanceReferenceInformation_GeneElement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceReferenceInformation_GeneElement {
  Optional<String> id();

  Optional<Identifier> element();

  Optional<List<Reference>> source();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  static ImmutableSubstanceReferenceInformation_GeneElement.Builder builder() {
    return ImmutableSubstanceReferenceInformation_GeneElement.builder();
  }
}

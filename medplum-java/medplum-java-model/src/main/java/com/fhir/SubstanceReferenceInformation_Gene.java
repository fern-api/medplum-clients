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
    as = ImmutableSubstanceReferenceInformation_Gene.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceReferenceInformation_Gene {
  Optional<List<Reference>> source();

  Optional<String> id();

  Optional<CodeableConcept> gene();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> geneSequenceOrigin();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceReferenceInformation_Gene.Builder builder() {
    return ImmutableSubstanceReferenceInformation_Gene.builder();
  }
}

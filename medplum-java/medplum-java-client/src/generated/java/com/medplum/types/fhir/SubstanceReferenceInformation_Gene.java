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
    as = ImmutableSubstanceReferenceInformation_Gene.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceReferenceInformation_Gene {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> source();

  Optional<String> id();

  Optional<CodeableConcept> gene();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> geneSequenceOrigin();

  static ImmutableSubstanceReferenceInformation_Gene.Builder builder() {
    return ImmutableSubstanceReferenceInformation_Gene.builder();
  }
}

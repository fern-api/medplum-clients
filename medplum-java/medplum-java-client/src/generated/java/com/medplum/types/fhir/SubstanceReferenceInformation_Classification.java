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
    as = ImmutableSubstanceReferenceInformation_Classification.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceReferenceInformation_Classification {
  Optional<CodeableConcept> classification();

  Optional<CodeableConcept> domain();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> subtype();

  Optional<List<Reference>> source();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableSubstanceReferenceInformation_Classification.Builder builder() {
    return ImmutableSubstanceReferenceInformation_Classification.builder();
  }
}

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
    as = ImmutableSubstanceReferenceInformation_Classification.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceReferenceInformation_Classification {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> domain();

  Optional<CodeableConcept> classification();

  Optional<List<Reference>> source();

  Optional<List<CodeableConcept>> subtype();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceReferenceInformation_Classification.Builder builder() {
    return ImmutableSubstanceReferenceInformation_Classification.builder();
  }
}

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
    as = ImmutableSubstanceSpecification_MolecularWeight.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_MolecularWeight {
  Optional<String> id();

  Optional<CodeableConcept> method();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<Quantity> amount();

  Optional<List<Extension>> modifierExtension();

  static ImmutableSubstanceSpecification_MolecularWeight.Builder builder() {
    return ImmutableSubstanceSpecification_MolecularWeight.builder();
  }
}

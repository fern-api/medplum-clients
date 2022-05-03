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
    as = ImmutableSubstanceSpecification_Structure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Structure {
  Optional<String> molecularFormula();

  Optional<List<SubstanceSpecification_Isotope>> isotope();

  Optional<CodeableConcept> stereochemistry();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> opticalActivity();

  Optional<List<SubstanceSpecification_Representation>> representation();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> source();

  Optional<SubstanceSpecification_MolecularWeight> molecularWeight();

  Optional<String> id();

  Optional<String> molecularFormulaByMoiety();

  static ImmutableSubstanceSpecification_Structure.Builder builder() {
    return ImmutableSubstanceSpecification_Structure.builder();
  }
}

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
    as = ImmutableSubstanceSpecification_Structure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Structure {
  Optional<List<Extension>> extension();

  Optional<List<Reference>> source();

  Optional<List<SubstanceSpecification_Representation>> representation();

  Optional<SubstanceSpecification_MolecularWeight> molecularWeight();

  Optional<String> molecularFormula();

  Optional<List<SubstanceSpecification_Isotope>> isotope();

  Optional<String> id();

  Optional<CodeableConcept> stereochemistry();

  Optional<String> molecularFormulaByMoiety();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> opticalActivity();

  static ImmutableSubstanceSpecification_Structure.Builder builder() {
    return ImmutableSubstanceSpecification_Structure.builder();
  }
}

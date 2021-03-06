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
  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> source();

  Optional<List<SubstanceSpecification_Representation>> representation();

  Optional<SubstanceSpecification_MolecularWeight> molecularWeight();

  Optional<String> id();

  Optional<String> molecularFormulaByMoiety();

  Optional<String> molecularFormula();

  Optional<List<Extension>> extension();

  Optional<List<SubstanceSpecification_Isotope>> isotope();

  Optional<CodeableConcept> opticalActivity();

  Optional<CodeableConcept> stereochemistry();

  static ImmutableSubstanceSpecification_Structure.Builder builder() {
    return ImmutableSubstanceSpecification_Structure.builder();
  }
}

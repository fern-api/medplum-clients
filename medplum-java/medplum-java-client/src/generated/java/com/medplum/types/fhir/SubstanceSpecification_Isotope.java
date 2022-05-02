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
    as = ImmutableSubstanceSpecification_Isotope.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Isotope {
  Optional<Quantity> halfLife();

  Optional<List<Extension>> extension();

  Optional<SubstanceSpecification_MolecularWeight> molecularWeight();

  Optional<CodeableConcept> substitution();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> identifier();

  Optional<CodeableConcept> name();

  Optional<String> id();

  static ImmutableSubstanceSpecification_Isotope.Builder builder() {
    return ImmutableSubstanceSpecification_Isotope.builder();
  }
}

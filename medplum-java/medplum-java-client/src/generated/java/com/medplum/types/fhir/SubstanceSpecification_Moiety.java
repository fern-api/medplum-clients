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
    as = ImmutableSubstanceSpecification_Moiety.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Moiety {
  Optional<String> molecularFormula();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> opticalActivity();

  Optional<String> id();

  Optional<CodeableConcept> stereochemistry();

  Optional<String> amountString();

  Optional<Quantity> amountQuantity();

  Optional<CodeableConcept> role();

  Optional<Identifier> identifier();

  Optional<String> name();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceSpecification_Moiety.Builder builder() {
    return ImmutableSubstanceSpecification_Moiety.builder();
  }
}

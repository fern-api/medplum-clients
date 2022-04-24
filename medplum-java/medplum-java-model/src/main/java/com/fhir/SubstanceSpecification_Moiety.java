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
    as = ImmutableSubstanceSpecification_Moiety.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Moiety {
  Optional<List<Extension>> modifierExtension();

  Optional<String> molecularFormula();

  Optional<CodeableConcept> opticalActivity();

  Optional<Quantity> amountQuantity();

  Optional<String> name();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<String> amountString();

  Optional<CodeableConcept> role();

  Optional<CodeableConcept> stereochemistry();

  Optional<Identifier> identifier();

  static ImmutableSubstanceSpecification_Moiety.Builder builder() {
    return ImmutableSubstanceSpecification_Moiety.builder();
  }
}

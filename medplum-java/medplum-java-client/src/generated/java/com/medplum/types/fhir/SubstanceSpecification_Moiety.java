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
  Optional<String> amountString();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> identifier();

  Optional<String> molecularFormula();

  Optional<CodeableConcept> opticalActivity();

  Optional<CodeableConcept> stereochemistry();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> role();

  Optional<Quantity> amountQuantity();

  Optional<String> id();

  Optional<String> name();

  static ImmutableSubstanceSpecification_Moiety.Builder builder() {
    return ImmutableSubstanceSpecification_Moiety.builder();
  }
}

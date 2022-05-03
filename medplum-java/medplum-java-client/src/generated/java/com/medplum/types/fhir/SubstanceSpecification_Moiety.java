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
  Optional<List<Extension>> extension();

  Optional<String> amountString();

  Optional<CodeableConcept> opticalActivity();

  Optional<Quantity> amountQuantity();

  Optional<Identifier> identifier();

  Optional<CodeableConcept> stereochemistry();

  Optional<String> name();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> role();

  Optional<String> molecularFormula();

  Optional<String> id();

  static ImmutableSubstanceSpecification_Moiety.Builder builder() {
    return ImmutableSubstanceSpecification_Moiety.builder();
  }
}

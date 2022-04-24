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
    as = ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductAuthorization_JurisdictionalAuthorization {
  Optional<String> id();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> validityPeriod();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> country();

  Optional<CodeableConcept> legalStatusOfSupply();

  Optional<List<Extension>> extension();

  static ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization.Builder builder() {
    return ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization.builder();
  }
}

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
    as = ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductAuthorization_JurisdictionalAuthorization {
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> legalStatusOfSupply();

  Optional<CodeableConcept> country();

  Optional<String> id();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> validityPeriod();

  static ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization.Builder builder() {
    return ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization.builder();
  }
}

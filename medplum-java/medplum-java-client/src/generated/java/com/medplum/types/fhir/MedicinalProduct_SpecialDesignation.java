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
    as = ImmutableMedicinalProduct_SpecialDesignation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProduct_SpecialDesignation {
  Optional<CodeableConcept> indicationCodeableConcept();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> status();

  Optional<DateTime> date();

  Optional<CodeableConcept> species();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<Reference> indicationReference();

  Optional<String> id();

  Optional<CodeableConcept> type();

  Optional<CodeableConcept> intendedUse();

  static ImmutableMedicinalProduct_SpecialDesignation.Builder builder() {
    return ImmutableMedicinalProduct_SpecialDesignation.builder();
  }
}
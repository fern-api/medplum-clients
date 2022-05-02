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
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> indicationCodeableConcept();

  Optional<Reference> indicationReference();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> intendedUse();

  Optional<CodeableConcept> species();

  Optional<String> id();

  Optional<CodeableConcept> status();

  Optional<DateTime> date();

  static ImmutableMedicinalProduct_SpecialDesignation.Builder builder() {
    return ImmutableMedicinalProduct_SpecialDesignation.builder();
  }
}

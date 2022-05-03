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
  Optional<Reference> indicationReference();

  Optional<CodeableConcept> species();

  Optional<CodeableConcept> status();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> type();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> date();

  Optional<CodeableConcept> intendedUse();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> indicationCodeableConcept();

  static ImmutableMedicinalProduct_SpecialDesignation.Builder builder() {
    return ImmutableMedicinalProduct_SpecialDesignation.builder();
  }
}

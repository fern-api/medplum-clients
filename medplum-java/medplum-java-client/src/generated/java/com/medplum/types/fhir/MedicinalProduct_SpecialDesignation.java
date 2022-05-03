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
  Optional<DateTime> date();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> intendedUse();

  Optional<Reference> indicationReference();

  Optional<CodeableConcept> type();

  Optional<CodeableConcept> indicationCodeableConcept();

  Optional<CodeableConcept> species();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> status();

  static ImmutableMedicinalProduct_SpecialDesignation.Builder builder() {
    return ImmutableMedicinalProduct_SpecialDesignation.builder();
  }
}

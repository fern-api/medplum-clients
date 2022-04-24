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
    as = ImmutableMedicinalProduct_SpecialDesignation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProduct_SpecialDesignation {
  Optional<CodeableConcept> type();

  Optional<CodeableConcept> status();

  Optional<CodeableConcept> indicationCodeableConcept();

  Optional<CodeableConcept> species();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> intendedUse();

  Optional<Reference> indicationReference();

  Optional<dateTime> date();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableMedicinalProduct_SpecialDesignation.Builder builder() {
    return ImmutableMedicinalProduct_SpecialDesignation.builder();
  }
}

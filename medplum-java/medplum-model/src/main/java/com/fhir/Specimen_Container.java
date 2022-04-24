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
    as = ImmutableSpecimen_Container.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Specimen_Container {
  Optional<CodeableConcept> type();

  Optional<List<Identifier>> identifier();

  Optional<Reference> additiveReference();

  Optional<CodeableConcept> additiveCodeableConcept();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Quantity> capacity();

  Optional<String> description();

  Optional<Quantity> specimenQuantity();

  static ImmutableSpecimen_Container.Builder builder() {
    return ImmutableSpecimen_Container.builder();
  }
}

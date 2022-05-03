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
    as = ImmutableSpecimen_Container.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Specimen_Container {
  Optional<List<Identifier>> identifier();

  Optional<String> id();

  Optional<String> description();

  Optional<Quantity> specimenQuantity();

  Optional<Quantity> capacity();

  Optional<CodeableConcept> additiveCodeableConcept();

  Optional<Reference> additiveReference();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableSpecimen_Container.Builder builder() {
    return ImmutableSpecimen_Container.builder();
  }
}

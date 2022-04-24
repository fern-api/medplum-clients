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
    as = ImmutableSubstanceSpecification_Property.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Property {
  Optional<List<Extension>> extension();

  Optional<String> parameters();

  Optional<CodeableConcept> definingSubstanceCodeableConcept();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> category();

  Optional<Reference> definingSubstanceReference();

  Optional<Quantity> amountQuantity();

  Optional<String> amountString();

  Optional<CodeableConcept> code();

  static ImmutableSubstanceSpecification_Property.Builder builder() {
    return ImmutableSubstanceSpecification_Property.builder();
  }
}

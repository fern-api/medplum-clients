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
    as = ImmutableSubstanceSpecification_Property.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Property {
  Optional<List<Extension>> extension();

  Optional<Reference> definingSubstanceReference();

  Optional<Quantity> amountQuantity();

  Optional<CodeableConcept> code();

  Optional<String> amountString();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> definingSubstanceCodeableConcept();

  Optional<String> parameters();

  Optional<String> id();

  Optional<CodeableConcept> category();

  static ImmutableSubstanceSpecification_Property.Builder builder() {
    return ImmutableSubstanceSpecification_Property.builder();
  }
}

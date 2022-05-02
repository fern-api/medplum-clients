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

  Optional<String> amountString();

  Optional<String> parameters();

  Optional<CodeableConcept> category();

  Optional<Reference> definingSubstanceReference();

  Optional<CodeableConcept> definingSubstanceCodeableConcept();

  Optional<Quantity> amountQuantity();

  Optional<CodeableConcept> code();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  static ImmutableSubstanceSpecification_Property.Builder builder() {
    return ImmutableSubstanceSpecification_Property.builder();
  }
}

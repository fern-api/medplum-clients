package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSubstanceSpecification_Relationship.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Relationship {
  Optional<Reference> substanceReference();

  Optional<Quantity> amountQuantity();

  Optional<CodeableConcept> amountType();

  Optional<List<Extension>> modifierExtension();

  Optional<Ratio> amountRatio();

  Optional<String> id();

  Optional<CodeableConcept> relationship();

  Optional<List<Reference>> source();

  Optional<String> amountString();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> substanceCodeableConcept();

  Optional<Ratio> amountRatioLowLimit();

  Optional<Boolean> isDefining();

  Optional<Range> amountRange();

  static ImmutableSubstanceSpecification_Relationship.Builder builder() {
    return ImmutableSubstanceSpecification_Relationship.builder();
  }
}

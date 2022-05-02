package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<CodeableConcept> relationship();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> isDefining();

  Optional<Quantity> amountQuantity();

  Optional<Range> amountRange();

  Optional<List<Reference>> source();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Reference> substanceReference();

  Optional<Ratio> amountRatioLowLimit();

  Optional<CodeableConcept> substanceCodeableConcept();

  Optional<CodeableConcept> amountType();

  Optional<String> amountString();

  Optional<Ratio> amountRatio();

  static ImmutableSubstanceSpecification_Relationship.Builder builder() {
    return ImmutableSubstanceSpecification_Relationship.builder();
  }
}

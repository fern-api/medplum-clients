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
  Optional<Boolean> isDefining();

  Optional<Ratio> amountRatio();

  Optional<Ratio> amountRatioLowLimit();

  Optional<CodeableConcept> substanceCodeableConcept();

  Optional<Reference> substanceReference();

  Optional<String> amountString();

  Optional<CodeableConcept> relationship();

  Optional<List<Reference>> source();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Range> amountRange();

  Optional<Quantity> amountQuantity();

  Optional<String> id();

  Optional<CodeableConcept> amountType();

  static ImmutableSubstanceSpecification_Relationship.Builder builder() {
    return ImmutableSubstanceSpecification_Relationship.builder();
  }
}

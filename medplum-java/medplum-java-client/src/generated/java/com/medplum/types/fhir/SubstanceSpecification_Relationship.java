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
  Optional<CodeableConcept> substanceCodeableConcept();

  Optional<CodeableConcept> relationship();

  Optional<Quantity> amountQuantity();

  Optional<List<Extension>> extension();

  Optional<Reference> substanceReference();

  Optional<Range> amountRange();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<CodeableConcept> amountType();

  Optional<List<Reference>> source();

  Optional<Ratio> amountRatioLowLimit();

  Optional<Ratio> amountRatio();

  Optional<Boolean> isDefining();

  Optional<String> amountString();

  static ImmutableSubstanceSpecification_Relationship.Builder builder() {
    return ImmutableSubstanceSpecification_Relationship.builder();
  }
}

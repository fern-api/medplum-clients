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
  Optional<CodeableConcept> amountType();

  Optional<CodeableConcept> substanceCodeableConcept();

  Optional<Reference> substanceReference();

  Optional<Boolean> isDefining();

  Optional<List<Extension>> extension();

  Optional<Ratio> amountRatioLowLimit();

  Optional<List<Extension>> modifierExtension();

  Optional<String> amountString();

  Optional<Quantity> amountQuantity();

  Optional<CodeableConcept> relationship();

  Optional<Ratio> amountRatio();

  Optional<Range> amountRange();

  Optional<List<Reference>> source();

  Optional<String> id();

  static ImmutableSubstanceSpecification_Relationship.Builder builder() {
    return ImmutableSubstanceSpecification_Relationship.builder();
  }
}

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
    as = ImmutableCoverageEligibilityRequest_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityRequest_Item {
  Optional<Reference> provider();

  Optional<Reference> facility();

  Optional<Quantity> quantity();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<CoverageEligibilityRequest_Diagnosis>> diagnosis();

  Optional<Money> unitPrice();

  Optional<List<positiveInt>> supportingInfoSequence();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> detail();

  Optional<CodeableConcept> category();

  Optional<CodeableConcept> productOrService();

  Optional<String> id();

  static ImmutableCoverageEligibilityRequest_Item.Builder builder() {
    return ImmutableCoverageEligibilityRequest_Item.builder();
  }
}

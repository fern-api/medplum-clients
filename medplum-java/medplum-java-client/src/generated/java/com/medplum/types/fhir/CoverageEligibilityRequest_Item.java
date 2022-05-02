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
    as = ImmutableCoverageEligibilityRequest_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityRequest_Item {
  Optional<Reference> facility();

  Optional<String> id();

  Optional<Reference> provider();

  Optional<Money> unitPrice();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<PositiveInt>> supportingInfoSequence();

  Optional<Quantity> quantity();

  Optional<List<Reference>> detail();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> category();

  Optional<CodeableConcept> productOrService();

  Optional<List<CoverageEligibilityRequest_Diagnosis>> diagnosis();

  Optional<List<Extension>> modifierExtension();

  static ImmutableCoverageEligibilityRequest_Item.Builder builder() {
    return ImmutableCoverageEligibilityRequest_Item.builder();
  }
}

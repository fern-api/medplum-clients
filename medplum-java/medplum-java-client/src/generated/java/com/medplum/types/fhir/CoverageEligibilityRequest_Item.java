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
  Optional<Quantity> quantity();

  Optional<Money> unitPrice();

  Optional<List<PositiveInt>> supportingInfoSequence();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> category();

  Optional<List<CodeableConcept>> modifier();

  Optional<Reference> facility();

  Optional<List<Reference>> detail();

  Optional<List<CoverageEligibilityRequest_Diagnosis>> diagnosis();

  Optional<CodeableConcept> productOrService();

  Optional<Reference> provider();

  Optional<List<Extension>> modifierExtension();

  static ImmutableCoverageEligibilityRequest_Item.Builder builder() {
    return ImmutableCoverageEligibilityRequest_Item.builder();
  }
}

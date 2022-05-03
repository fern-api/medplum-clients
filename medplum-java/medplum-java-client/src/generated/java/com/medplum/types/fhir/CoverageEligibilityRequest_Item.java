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

  Optional<String> id();

  Optional<Reference> facility();

  Optional<List<PositiveInt>> supportingInfoSequence();

  Optional<List<CoverageEligibilityRequest_Diagnosis>> diagnosis();

  Optional<CodeableConcept> productOrService();

  Optional<List<Reference>> detail();

  Optional<List<CodeableConcept>> modifier();

  Optional<Reference> provider();

  Optional<Money> unitPrice();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> category();

  Optional<List<Extension>> modifierExtension();

  static ImmutableCoverageEligibilityRequest_Item.Builder builder() {
    return ImmutableCoverageEligibilityRequest_Item.builder();
  }
}

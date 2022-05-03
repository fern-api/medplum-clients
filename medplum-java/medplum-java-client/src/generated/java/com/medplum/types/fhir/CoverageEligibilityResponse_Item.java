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
    as = ImmutableCoverageEligibilityResponse_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityResponse_Item {
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> term();

  Optional<CodeableConcept> category();

  Optional<String> id();

  Optional<List<CodeableConcept>> authorizationSupporting();

  Optional<String> description();

  Optional<CodeableConcept> unit();

  Optional<CodeableConcept> productOrService();

  Optional<CodeableConcept> network();

  Optional<List<CoverageEligibilityResponse_Benefit>> benefit();

  Optional<Uri> authorizationUrl();

  Optional<Boolean> authorizationRequired();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> excluded();

  Optional<Reference> provider();

  Optional<String> name();

  static ImmutableCoverageEligibilityResponse_Item.Builder builder() {
    return ImmutableCoverageEligibilityResponse_Item.builder();
  }
}

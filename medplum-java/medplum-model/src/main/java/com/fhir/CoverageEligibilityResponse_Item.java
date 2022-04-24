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
    as = ImmutableCoverageEligibilityResponse_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityResponse_Item {
  Optional<CodeableConcept> term();

  Optional<CodeableConcept> category();

  Optional<Boolean> authorizationRequired();

  Optional<List<Extension>> extension();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<CodeableConcept> network();

  Optional<CodeableConcept> unit();

  Optional<Boolean> excluded();

  Optional<List<CoverageEligibilityResponse_Benefit>> benefit();

  Optional<String> id();

  Optional<List<CodeableConcept>> modifier();

  Optional<CodeableConcept> productOrService();

  Optional<List<CodeableConcept>> authorizationSupporting();

  Optional<uri> authorizationUrl();

  Optional<Reference> provider();

  static ImmutableCoverageEligibilityResponse_Item.Builder builder() {
    return ImmutableCoverageEligibilityResponse_Item.builder();
  }
}

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
  Optional<String> description();

  Optional<List<CodeableConcept>> modifier();

  Optional<CodeableConcept> term();

  Optional<Uri> authorizationUrl();

  Optional<List<CoverageEligibilityResponse_Benefit>> benefit();

  Optional<Boolean> excluded();

  Optional<CodeableConcept> network();

  Optional<CodeableConcept> category();

  Optional<String> name();

  Optional<List<Extension>> extension();

  Optional<Reference> provider();

  Optional<CodeableConcept> unit();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> authorizationSupporting();

  Optional<CodeableConcept> productOrService();

  Optional<Boolean> authorizationRequired();

  static ImmutableCoverageEligibilityResponse_Item.Builder builder() {
    return ImmutableCoverageEligibilityResponse_Item.builder();
  }
}

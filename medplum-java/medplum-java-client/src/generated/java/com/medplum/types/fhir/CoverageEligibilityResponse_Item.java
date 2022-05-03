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
  Optional<List<CoverageEligibilityResponse_Benefit>> benefit();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> provider();

  Optional<List<Extension>> extension();

  Optional<Boolean> excluded();

  Optional<String> description();

  Optional<List<CodeableConcept>> modifier();

  Optional<String> name();

  Optional<String> id();

  Optional<Uri> authorizationUrl();

  Optional<CodeableConcept> unit();

  Optional<Boolean> authorizationRequired();

  Optional<CodeableConcept> network();

  Optional<List<CodeableConcept>> authorizationSupporting();

  Optional<CodeableConcept> category();

  Optional<CodeableConcept> term();

  Optional<CodeableConcept> productOrService();

  static ImmutableCoverageEligibilityResponse_Item.Builder builder() {
    return ImmutableCoverageEligibilityResponse_Item.builder();
  }
}

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
  Optional<String> id();

  Optional<String> description();

  Optional<CodeableConcept> unit();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> authorizationUrl();

  Optional<List<CodeableConcept>> authorizationSupporting();

  Optional<Reference> provider();

  Optional<String> name();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> category();

  Optional<List<CodeableConcept>> modifier();

  Optional<Boolean> authorizationRequired();

  Optional<CodeableConcept> term();

  Optional<CodeableConcept> productOrService();

  Optional<Boolean> excluded();

  Optional<CodeableConcept> network();

  Optional<List<CoverageEligibilityResponse_Benefit>> benefit();

  static ImmutableCoverageEligibilityResponse_Item.Builder builder() {
    return ImmutableCoverageEligibilityResponse_Item.builder();
  }
}

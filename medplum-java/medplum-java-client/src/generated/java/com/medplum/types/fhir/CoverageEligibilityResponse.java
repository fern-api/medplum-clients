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
    as = ImmutableCoverageEligibilityResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityResponse {
  Optional<List<CoverageeligibilityresponsePurposeItem>> purpose();

  Optional<String> servicedDate();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> status();

  Optional<Reference> requestor();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<String> disposition();

  Reference request();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Reference patient();

  String resourceType();

  Reference insurer();

  Optional<Meta> meta();

  Optional<List<CoverageEligibilityResponse_Insurance>> insurance();

  Optional<CoverageeligibilityresponseOutcome> outcome();

  Optional<DateTime> created();

  Optional<CodeableConcept> form();

  Optional<String> preAuthRef();

  Optional<Code> language();

  Optional<Period> servicedPeriod();

  Optional<List<CoverageEligibilityResponse_Error>> error();

  static ImmutableCoverageEligibilityResponse.RequestBuildStage builder() {
    return ImmutableCoverageEligibilityResponse.builder();
  }
}

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
  Optional<CoverageeligibilityresponseOutcome> outcome();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<String> servicedDate();

  Optional<CodeableConcept> form();

  Optional<Period> servicedPeriod();

  Optional<List<Extension>> extension();

  Optional<DateTime> created();

  Optional<List<CoverageEligibilityResponse_Error>> error();

  Optional<String> disposition();

  Optional<List<Extension>> modifierExtension();

  Reference request();

  Reference insurer();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Reference patient();

  Optional<List<CoverageEligibilityResponse_Insurance>> insurance();

  Optional<Code> status();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<List<CoverageeligibilityresponsePurposeItem>> purpose();

  Optional<String> preAuthRef();

  Optional<Reference> requestor();

  Optional<Meta> meta();

  Optional<Narrative> text();

  static ImmutableCoverageEligibilityResponse.RequestBuildStage builder() {
    return ImmutableCoverageEligibilityResponse.builder();
  }
}

package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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

  Optional<List<Extension>> extension();

  Reference request();

  Optional<Narrative> text();

  Optional<dateTime> created();

  Optional<String> preAuthRef();

  Optional<Period> servicedPeriod();

  Optional<uri> implicitRules();

  Reference patient();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Reference insurer();

  Optional<List<Identifier>> identifier();

  Optional<String> servicedDate();

  Optional<id> id();

  Optional<code> status();

  Optional<List<CoverageeligibilityresponsePurposeItem>> purpose();

  Optional<List<CoverageEligibilityResponse_Insurance>> insurance();

  Optional<List<CoverageEligibilityResponse_Error>> error();

  Optional<Reference> requestor();

  Optional<List<Extension>> modifierExtension();

  Optional<code> language();

  Optional<String> disposition();

  Optional<CodeableConcept> form();

  String resourceType();

  static ImmutableCoverageEligibilityResponse.RequestBuildStage builder() {
    return ImmutableCoverageEligibilityResponse.builder();
  }
}

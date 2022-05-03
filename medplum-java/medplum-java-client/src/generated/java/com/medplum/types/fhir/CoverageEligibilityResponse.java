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

  Reference insurer();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<Reference> requestor();

  Optional<Code> status();

  Optional<Code> language();

  Optional<String> servicedDate();

  Optional<List<CoverageeligibilityresponsePurposeItem>> purpose();

  Optional<Period> servicedPeriod();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<CodeableConcept> form();

  String resourceType();

  Reference patient();

  Optional<List<CoverageEligibilityResponse_Error>> error();

  Optional<List<Identifier>> identifier();

  Optional<List<CoverageEligibilityResponse_Insurance>> insurance();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Reference request();

  Optional<String> preAuthRef();

  Optional<DateTime> created();

  Optional<String> disposition();

  Optional<Id> id();

  static ImmutableCoverageEligibilityResponse.InsurerBuildStage builder() {
    return ImmutableCoverageEligibilityResponse.builder();
  }
}

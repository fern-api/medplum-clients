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
  Optional<List<CoverageEligibilityResponse_Error>> error();

  Optional<Id> id();

  Optional<List<CoverageEligibilityResponse_Insurance>> insurance();

  Optional<Reference> requestor();

  Optional<Code> status();

  Optional<CoverageeligibilityresponseOutcome> outcome();

  Optional<Meta> meta();

  Reference patient();

  Reference insurer();

  Optional<List<CoverageeligibilityresponsePurposeItem>> purpose();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<DateTime> created();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<CodeableConcept> form();

  Optional<Period> servicedPeriod();

  Optional<String> disposition();

  Optional<List<Identifier>> identifier();

  Reference request();

  Optional<List<Extension>> extension();

  Optional<String> preAuthRef();

  Optional<String> servicedDate();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  static ImmutableCoverageEligibilityResponse.PatientBuildStage builder() {
    return ImmutableCoverageEligibilityResponse.builder();
  }
}

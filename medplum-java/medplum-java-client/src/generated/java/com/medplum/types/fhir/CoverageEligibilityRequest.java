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
    as = ImmutableCoverageEligibilityRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityRequest {
  Optional<List<CoverageEligibilityRequest_Insurance>> insurance();

  Optional<Period> servicedPeriod();

  Optional<CodeableConcept> priority();

  String resourceType();

  Optional<String> servicedDate();

  Optional<Code> status();

  Optional<Narrative> text();

  Optional<Reference> facility();

  Optional<List<CoverageeligibilityrequestPurposeItem>> purpose();

  Reference patient();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<DateTime> created();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CoverageEligibilityRequest_Item>> item();

  Optional<List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo();

  Optional<Reference> provider();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Reference insurer();

  Optional<Reference> enterer();

  static ImmutableCoverageEligibilityRequest.ResourceTypeBuildStage builder() {
    return ImmutableCoverageEligibilityRequest.builder();
  }
}

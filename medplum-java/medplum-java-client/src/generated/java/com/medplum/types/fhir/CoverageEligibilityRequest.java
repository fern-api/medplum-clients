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
  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<Period> servicedPeriod();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<String> servicedDate();

  Optional<List<CoverageEligibilityRequest_Insurance>> insurance();

  Reference insurer();

  Optional<Reference> provider();

  Reference patient();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<Reference> enterer();

  Optional<Uri> implicitRules();

  Optional<List<CoverageeligibilityrequestPurposeItem>> purpose();

  Optional<Code> status();

  Optional<Reference> facility();

  Optional<CodeableConcept> priority();

  Optional<DateTime> created();

  Optional<List<CoverageEligibilityRequest_Item>> item();

  static ImmutableCoverageEligibilityRequest.ResourceTypeBuildStage builder() {
    return ImmutableCoverageEligibilityRequest.builder();
  }
}

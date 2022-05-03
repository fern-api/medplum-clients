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
  Optional<Reference> enterer();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<Reference> facility();

  Optional<List<CoverageEligibilityRequest_Insurance>> insurance();

  Optional<Code> status();

  Reference insurer();

  Optional<List<CoverageeligibilityrequestPurposeItem>> purpose();

  Optional<Narrative> text();

  Optional<CodeableConcept> priority();

  Optional<Reference> provider();

  Optional<List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo();

  Optional<List<CoverageEligibilityRequest_Item>> item();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<String> servicedDate();

  Reference patient();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> servicedPeriod();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<DateTime> created();

  static ImmutableCoverageEligibilityRequest.InsurerBuildStage builder() {
    return ImmutableCoverageEligibilityRequest.builder();
  }
}

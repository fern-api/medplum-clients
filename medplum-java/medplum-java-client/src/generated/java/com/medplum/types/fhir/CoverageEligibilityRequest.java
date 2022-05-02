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
  Optional<List<Extension>> modifierExtension();

  Optional<Code> status();

  Optional<Reference> facility();

  Reference patient();

  Optional<Period> servicedPeriod();

  Optional<Reference> enterer();

  Optional<CodeableConcept> priority();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<List<CoverageeligibilityrequestPurposeItem>> purpose();

  Optional<String> servicedDate();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<Reference> provider();

  String resourceType();

  Optional<Id> id();

  Optional<DateTime> created();

  Reference insurer();

  Optional<List<ResourceList>> contained();

  Optional<List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo();

  Optional<List<CoverageEligibilityRequest_Item>> item();

  Optional<List<CoverageEligibilityRequest_Insurance>> insurance();

  Optional<Meta> meta();

  static ImmutableCoverageEligibilityRequest.PatientBuildStage builder() {
    return ImmutableCoverageEligibilityRequest.builder();
  }
}

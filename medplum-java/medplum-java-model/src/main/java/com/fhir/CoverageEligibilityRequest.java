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
    as = ImmutableCoverageEligibilityRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityRequest {
  Optional<CodeableConcept> priority();

  Optional<String> servicedDate();

  Optional<List<Identifier>> identifier();

  Optional<id> id();

  Optional<List<CoverageeligibilityrequestPurposeItem>> purpose();

  Optional<Narrative> text();

  Optional<List<CoverageEligibilityRequest_SupportingInfo>> supportingInfo();

  Optional<code> status();

  Optional<uri> implicitRules();

  Optional<List<CoverageEligibilityRequest_Insurance>> insurance();

  Optional<List<CoverageEligibilityRequest_Item>> item();

  Optional<Reference> enterer();

  Optional<Reference> provider();

  Optional<code> language();

  Reference insurer();

  Optional<Period> servicedPeriod();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  String resourceType();

  Optional<dateTime> created();

  Optional<Reference> facility();

  Reference patient();

  static ImmutableCoverageEligibilityRequest.InsurerBuildStage builder() {
    return ImmutableCoverageEligibilityRequest.builder();
  }
}

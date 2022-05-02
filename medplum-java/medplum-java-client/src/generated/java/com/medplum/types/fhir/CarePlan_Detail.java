package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCarePlan_Detail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CarePlan_Detail {
  Optional<List<Extension>> extension();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> dailyAmount();

  Optional<Careplan_detailStatus> status();

  Optional<String> scheduledString();

  Optional<Quantity> quantity();

  Optional<CodeableConcept> statusReason();

  Optional<List<Reference>> goal();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<String> id();

  Optional<Reference> productReference();

  Optional<Reference> location();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> reasonReference();

  Optional<List<Reference>> performer();

  Optional<Timing> scheduledTiming();

  Optional<String> description();

  Optional<Code> kind();

  Optional<Boolean> doNotPerform();

  Optional<Period> scheduledPeriod();

  Optional<CodeableConcept> code();

  static ImmutableCarePlan_Detail.Builder builder() {
    return ImmutableCarePlan_Detail.builder();
  }
}

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
  Optional<CodeableConcept> statusReason();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Boolean> doNotPerform();

  Optional<Code> kind();

  Optional<Reference> location();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<Careplan_detailStatus> status();

  Optional<List<Reference>> goal();

  Optional<List<Reference>> performer();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Quantity> quantity();

  Optional<CodeableConcept> code();

  Optional<String> scheduledString();

  Optional<Reference> productReference();

  Optional<List<Reference>> reasonReference();

  Optional<Period> scheduledPeriod();

  Optional<Timing> scheduledTiming();

  Optional<Quantity> dailyAmount();

  Optional<String> description();

  Optional<List<Uri>> instantiatesUri();

  static ImmutableCarePlan_Detail.Builder builder() {
    return ImmutableCarePlan_Detail.builder();
  }
}

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
  Optional<Careplan_detailStatus> status();

  Optional<Boolean> doNotPerform();

  Optional<CodeableConcept> code();

  Optional<Quantity> quantity();

  Optional<Reference> location();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> statusReason();

  Optional<List<Reference>> goal();

  Optional<Quantity> dailyAmount();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<String> scheduledString();

  Optional<List<Reference>> performer();

  Optional<Timing> scheduledTiming();

  Optional<Code> kind();

  Optional<List<Reference>> reasonReference();

  Optional<String> description();

  Optional<Period> scheduledPeriod();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> productReference();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<CodeableConcept> productCodeableConcept();

  static ImmutableCarePlan_Detail.Builder builder() {
    return ImmutableCarePlan_Detail.builder();
  }
}

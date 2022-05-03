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
  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> reasonReference();

  Optional<String> description();

  Optional<Timing> scheduledTiming();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  Optional<Reference> location();

  Optional<String> scheduledString();

  Optional<Boolean> doNotPerform();

  Optional<String> id();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<CodeableConcept> statusReason();

  Optional<Quantity> dailyAmount();

  Optional<Careplan_detailStatus> status();

  Optional<Quantity> quantity();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> goal();

  Optional<Period> scheduledPeriod();

  Optional<List<Reference>> performer();

  Optional<Code> kind();

  Optional<List<Uri>> instantiatesUri();

  Optional<Reference> productReference();

  Optional<List<Canonical>> instantiatesCanonical();

  static ImmutableCarePlan_Detail.Builder builder() {
    return ImmutableCarePlan_Detail.builder();
  }
}

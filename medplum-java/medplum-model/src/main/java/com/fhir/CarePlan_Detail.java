package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Timing> scheduledTiming();

  Optional<Period> scheduledPeriod();

  Optional<Careplan_detailStatus> status();

  Optional<CodeableConcept> code();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<List<Reference>> reasonReference();

  Optional<Quantity> quantity();

  Optional<String> scheduledString();

  Optional<List<Extension>> modifierExtension();

  Optional<List<canonical>> instantiatesCanonical();

  Optional<List<Reference>> performer();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Boolean> doNotPerform();

  Optional<Quantity> dailyAmount();

  Optional<String> description();

  Optional<List<Reference>> goal();

  Optional<Reference> location();

  Optional<String> id();

  Optional<CodeableConcept> statusReason();

  Optional<code> kind();

  Optional<List<uri>> instantiatesUri();

  Optional<Reference> productReference();

  static ImmutableCarePlan_Detail.Builder builder() {
    return ImmutableCarePlan_Detail.builder();
  }
}

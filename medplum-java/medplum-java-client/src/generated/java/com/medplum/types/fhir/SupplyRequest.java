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
    as = ImmutableSupplyRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SupplyRequest {
  Optional<Meta> meta();

  Optional<Code> priority();

  Optional<Period> occurrencePeriod();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<ResourceList>> contained();

  Optional<Reference> requester();

  Optional<Code> language();

  Optional<CodeableConcept> category();

  Optional<Reference> deliverTo();

  Optional<List<Reference>> supplier();

  Optional<Reference> deliverFrom();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> authoredOn();

  Optional<Narrative> text();

  Optional<List<SupplyRequest_Parameter>> parameter();

  Optional<List<Identifier>> identifier();

  Optional<String> occurrenceDateTime();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<Reference> itemReference();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<CodeableConcept> itemCodeableConcept();

  Quantity quantity();

  Optional<Timing> occurrenceTiming();

  Optional<SupplyrequestStatus> status();

  Optional<List<Reference>> reasonReference();

  static ImmutableSupplyRequest.ResourceTypeBuildStage builder() {
    return ImmutableSupplyRequest.builder();
  }
}

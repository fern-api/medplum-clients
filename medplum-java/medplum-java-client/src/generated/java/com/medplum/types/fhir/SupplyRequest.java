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
  Optional<Reference> requester();

  Optional<Reference> itemReference();

  Optional<Timing> occurrenceTiming();

  String resourceType();

  Optional<Reference> deliverFrom();

  Optional<List<Reference>> reasonReference();

  Quantity quantity();

  Optional<String> occurrenceDateTime();

  Optional<CodeableConcept> category();

  Optional<List<Reference>> supplier();

  Optional<List<Identifier>> identifier();

  Optional<Period> occurrencePeriod();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<SupplyrequestStatus> status();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Reference> deliverTo();

  Optional<List<SupplyRequest_Parameter>> parameter();

  Optional<CodeableConcept> itemCodeableConcept();

  Optional<Code> priority();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> authoredOn();

  static ImmutableSupplyRequest.ResourceTypeBuildStage builder() {
    return ImmutableSupplyRequest.builder();
  }
}

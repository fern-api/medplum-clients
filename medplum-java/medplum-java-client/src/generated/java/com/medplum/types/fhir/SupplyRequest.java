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
  Optional<List<CodeableConcept>> reasonCode();

  Optional<Period> occurrencePeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> requester();

  Optional<Reference> deliverFrom();

  Quantity quantity();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> category();

  Optional<CodeableConcept> itemCodeableConcept();

  Optional<List<SupplyRequest_Parameter>> parameter();

  Optional<DateTime> authoredOn();

  Optional<SupplyrequestStatus> status();

  Optional<Code> priority();

  Optional<Uri> implicitRules();

  Optional<String> occurrenceDateTime();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> reasonReference();

  Optional<Timing> occurrenceTiming();

  Optional<Meta> meta();

  String resourceType();

  Optional<Reference> deliverTo();

  Optional<List<Reference>> supplier();

  Optional<Reference> itemReference();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<Narrative> text();

  static ImmutableSupplyRequest.QuantityBuildStage builder() {
    return ImmutableSupplyRequest.builder();
  }
}

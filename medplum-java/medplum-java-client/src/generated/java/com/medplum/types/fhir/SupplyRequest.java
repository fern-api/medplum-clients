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
  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<Period> occurrencePeriod();

  Optional<Timing> occurrenceTiming();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  Optional<Reference> deliverFrom();

  Optional<SupplyrequestStatus> status();

  Optional<List<SupplyRequest_Parameter>> parameter();

  Optional<CodeableConcept> itemCodeableConcept();

  Optional<Reference> deliverTo();

  Optional<List<Reference>> supplier();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<CodeableConcept> category();

  Optional<DateTime> authoredOn();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Quantity quantity();

  Optional<String> occurrenceDateTime();

  String resourceType();

  Optional<List<Reference>> reasonReference();

  Optional<Code> priority();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> requester();

  Optional<Code> language();

  Optional<Reference> itemReference();

  static ImmutableSupplyRequest.QuantityBuildStage builder() {
    return ImmutableSupplyRequest.builder();
  }
}

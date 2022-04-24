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
    as = ImmutableSupplyRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SupplyRequest {
  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> itemCodeableConcept();

  Optional<String> occurrenceDateTime();

  Optional<Reference> deliverFrom();

  Optional<Period> occurrencePeriod();

  Optional<Timing> occurrenceTiming();

  Optional<List<Reference>> supplier();

  Optional<code> language();

  Optional<List<Reference>> reasonReference();

  Optional<uri> implicitRules();

  Optional<List<SupplyRequest_Parameter>> parameter();

  Quantity quantity();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<dateTime> authoredOn();

  String resourceType();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<Reference> deliverTo();

  Optional<SupplyrequestStatus> status();

  Optional<Reference> itemReference();

  Optional<code> priority();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> category();

  Optional<id> id();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Reference> requester();

  static ImmutableSupplyRequest.QuantityBuildStage builder() {
    return ImmutableSupplyRequest.builder();
  }
}

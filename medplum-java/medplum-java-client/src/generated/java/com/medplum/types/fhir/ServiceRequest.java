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
    as = ImmutableServiceRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ServiceRequest {
  Optional<Timing> occurrenceTiming();

  Optional<List<Reference>> reasonReference();

  Optional<List<Reference>> basedOn();

  Optional<List<Reference>> locationReference();

  Optional<String> occurrenceDateTime();

  Optional<Reference> requester();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<CodeableConcept>> locationCode();

  Optional<List<Reference>> specimen();

  Optional<Range> quantityRange();

  Optional<List<CodeableConcept>> orderDetail();

  Optional<List<Reference>> performer();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> category();

  Optional<Ratio> quantityRatio();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> performerType();

  Optional<List<Reference>> relevantHistory();

  Optional<Boolean> doNotPerform();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Boolean> asNeededBoolean();

  String resourceType();

  Optional<Id> id();

  Optional<String> patientInstruction();

  Optional<Meta> meta();

  Optional<Period> occurrencePeriod();

  Reference subject();

  Optional<Reference> encounter();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> replaces();

  Optional<DateTime> authoredOn();

  Optional<List<Reference>> supportingInfo();

  Optional<Code> intent();

  Optional<CodeableConcept> code();

  Optional<Quantity> quantityQuantity();

  Optional<Code> priority();

  Optional<Code> status();

  Optional<CodeableConcept> asNeededCodeableConcept();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> insurance();

  Optional<List<CodeableConcept>> bodySite();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> requisition();

  static ImmutableServiceRequest.ResourceTypeBuildStage builder() {
    return ImmutableServiceRequest.builder();
  }
}

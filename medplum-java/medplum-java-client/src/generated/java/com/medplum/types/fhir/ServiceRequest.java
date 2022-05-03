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
  Optional<List<Reference>> reasonReference();

  Optional<Id> id();

  Optional<List<Reference>> specimen();

  Optional<List<Annotation>> note();

  Optional<Quantity> quantityQuantity();

  Optional<Period> occurrencePeriod();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<CodeableConcept>> locationCode();

  Optional<Range> quantityRange();

  Optional<List<Reference>> performer();

  Optional<Narrative> text();

  Optional<CodeableConcept> code();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> requisition();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<List<CodeableConcept>> orderDetail();

  Optional<Ratio> quantityRatio();

  Optional<List<Reference>> insurance();

  Reference subject();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> category();

  Optional<Reference> encounter();

  Optional<List<Reference>> supportingInfo();

  Optional<List<CodeableConcept>> bodySite();

  Optional<Code> language();

  Optional<Code> priority();

  Optional<Boolean> doNotPerform();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> locationReference();

  Optional<List<Reference>> replaces();

  Optional<Code> status();

  Optional<List<Identifier>> identifier();

  Optional<String> patientInstruction();

  Optional<DateTime> authoredOn();

  Optional<Boolean> asNeededBoolean();

  Optional<Timing> occurrenceTiming();

  Optional<CodeableConcept> asNeededCodeableConcept();

  Optional<Meta> meta();

  Optional<List<Reference>> basedOn();

  Optional<CodeableConcept> performerType();

  Optional<List<Reference>> relevantHistory();

  Optional<Reference> requester();

  Optional<List<Uri>> instantiatesUri();

  Optional<String> occurrenceDateTime();

  Optional<Code> intent();

  static ImmutableServiceRequest.ResourceTypeBuildStage builder() {
    return ImmutableServiceRequest.builder();
  }
}

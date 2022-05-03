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
  Optional<List<CodeableConcept>> orderDetail();

  Optional<CodeableConcept> asNeededCodeableConcept();

  Optional<Uri> implicitRules();

  Optional<Timing> occurrenceTiming();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Period> occurrencePeriod();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> replaces();

  Optional<Reference> requester();

  Optional<DateTime> authoredOn();

  Optional<CodeableConcept> performerType();

  Optional<List<Reference>> performer();

  Optional<String> patientInstruction();

  Optional<List<Reference>> locationReference();

  Optional<Quantity> quantityQuantity();

  Optional<List<Reference>> basedOn();

  Optional<List<Reference>> reasonReference();

  Optional<Narrative> text();

  Optional<CodeableConcept> code();

  Reference subject();

  Optional<Reference> encounter();

  Optional<Meta> meta();

  Optional<Code> status();

  Optional<Code> intent();

  Optional<List<CodeableConcept>> locationCode();

  Optional<Ratio> quantityRatio();

  Optional<Code> language();

  Optional<List<Reference>> supportingInfo();

  Optional<List<Reference>> insurance();

  Optional<List<Reference>> relevantHistory();

  Optional<Id> id();

  Optional<List<Annotation>> note();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> specimen();

  Optional<Identifier> requisition();

  Optional<List<Identifier>> identifier();

  Optional<Boolean> doNotPerform();

  Optional<List<CodeableConcept>> category();

  Optional<Boolean> asNeededBoolean();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Range> quantityRange();

  Optional<Code> priority();

  Optional<String> occurrenceDateTime();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<CodeableConcept>> bodySite();

  Optional<List<Extension>> extension();

  static ImmutableServiceRequest.SubjectBuildStage builder() {
    return ImmutableServiceRequest.builder();
  }
}

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
  Optional<List<Reference>> specimen();

  Optional<String> patientInstruction();

  Optional<List<CodeableConcept>> orderDetail();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<String> occurrenceDateTime();

  Optional<CodeableConcept> asNeededCodeableConcept();

  Optional<List<Reference>> reasonReference();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<List<Reference>> basedOn();

  Optional<Code> intent();

  Optional<CodeableConcept> performerType();

  Optional<Code> priority();

  Optional<Code> language();

  Optional<CodeableConcept> code();

  Optional<List<Reference>> supportingInfo();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Reference> requester();

  Optional<Boolean> doNotPerform();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<Code> status();

  Optional<Reference> encounter();

  Optional<Timing> occurrenceTiming();

  Optional<List<Reference>> locationReference();

  Optional<List<Reference>> performer();

  Optional<List<Identifier>> identifier();

  Optional<Quantity> quantityQuantity();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<Reference>> replaces();

  Optional<List<CodeableConcept>> category();

  Optional<Range> quantityRange();

  Reference subject();

  Optional<List<Reference>> insurance();

  Optional<Boolean> asNeededBoolean();

  Optional<List<CodeableConcept>> locationCode();

  Optional<DateTime> authoredOn();

  Optional<Period> occurrencePeriod();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> bodySite();

  Optional<List<Reference>> relevantHistory();

  String resourceType();

  Optional<Ratio> quantityRatio();

  Optional<Identifier> requisition();

  Optional<List<Annotation>> note();

  static ImmutableServiceRequest.SubjectBuildStage builder() {
    return ImmutableServiceRequest.builder();
  }
}

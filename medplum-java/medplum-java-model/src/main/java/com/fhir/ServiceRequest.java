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
    as = ImmutableServiceRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ServiceRequest {
  Optional<List<ResourceList>> contained();

  Optional<List<uri>> instantiatesUri();

  Optional<Range> quantityRange();

  Optional<id> id();

  Optional<List<Reference>> replaces();

  Optional<Boolean> doNotPerform();

  Optional<List<Reference>> supportingInfo();

  Optional<Timing> occurrenceTiming();

  Optional<Reference> requester();

  Optional<code> language();

  Optional<List<Reference>> specimen();

  Optional<List<Extension>> extension();

  Optional<uri> implicitRules();

  Optional<code> intent();

  Optional<List<CodeableConcept>> bodySite();

  Optional<CodeableConcept> asNeededCodeableConcept();

  Optional<Meta> meta();

  Optional<CodeableConcept> performerType();

  Optional<List<Reference>> relevantHistory();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> category();

  Optional<List<CodeableConcept>> orderDetail();

  Optional<List<Annotation>> note();

  Optional<code> status();

  Optional<List<canonical>> instantiatesCanonical();

  Optional<String> occurrenceDateTime();

  Optional<Period> occurrencePeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> basedOn();

  Optional<List<Reference>> locationReference();

  Optional<List<Reference>> insurance();

  Optional<Reference> encounter();

  Optional<dateTime> authoredOn();

  Optional<Quantity> quantityQuantity();

  Optional<Ratio> quantityRatio();

  Optional<List<Reference>> performer();

  Optional<List<Reference>> reasonReference();

  Optional<Identifier> requisition();

  Reference subject();

  String resourceType();

  Optional<String> patientInstruction();

  Optional<CodeableConcept> code();

  Optional<Boolean> asNeededBoolean();

  Optional<code> priority();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<CodeableConcept>> locationCode();

  static ImmutableServiceRequest.SubjectBuildStage builder() {
    return ImmutableServiceRequest.builder();
  }
}

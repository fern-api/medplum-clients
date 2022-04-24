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
    as = ImmutableMedicationRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationRequest {
  Optional<List<Reference>> detectedIssue();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<List<CodeableConcept>> category();

  Optional<List<canonical>> instantiatesCanonical();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> reasonReference();

  Optional<Identifier> groupIdentifier();

  Optional<List<Reference>> eventHistory();

  Optional<Boolean> doNotPerform();

  Optional<CodeableConcept> statusReason();

  Optional<dateTime> authoredOn();

  Optional<CodeableConcept> courseOfTherapyType();

  Optional<List<Dosage>> dosageInstruction();

  Optional<Reference> priorPrescription();

  String resourceType();

  Optional<Reference> encounter();

  Optional<Reference> recorder();

  Optional<List<ResourceList>> contained();

  Optional<code> priority();

  Optional<List<Extension>> modifierExtension();

  Optional<MedicationRequest_Substitution> substitution();

  Optional<Boolean> reportedBoolean();

  Optional<uri> implicitRules();

  Optional<code> status();

  Optional<List<Reference>> insurance();

  Optional<Reference> reportedReference();

  Optional<MedicationRequest_DispenseRequest> dispenseRequest();

  Optional<Reference> performer();

  Optional<Meta> meta();

  Optional<Reference> medicationReference();

  Optional<List<uri>> instantiatesUri();

  Reference subject();

  Optional<code> language();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<CodeableConcept> performerType();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> supportingInformation();

  Optional<Reference> requester();

  Optional<List<Reference>> basedOn();

  Optional<id> id();

  Optional<code> intent();

  static ImmutableMedicationRequest.ResourceTypeBuildStage builder() {
    return ImmutableMedicationRequest.builder();
  }
}

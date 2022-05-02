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
    as = ImmutableMedicationRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationRequest {
  Optional<List<Reference>> basedOn();

  Optional<Boolean> doNotPerform();

  Optional<Boolean> reportedBoolean();

  Optional<Reference> medicationReference();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<Reference> encounter();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> priorPrescription();

  Optional<List<Reference>> eventHistory();

  Reference subject();

  Optional<List<Dosage>> dosageInstruction();

  Optional<Identifier> groupIdentifier();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Uri>> instantiatesUri();

  Optional<Narrative> text();

  Optional<Reference> performer();

  Optional<Reference> reportedReference();

  Optional<List<Reference>> reasonReference();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> insurance();

  Optional<DateTime> authoredOn();

  Optional<MedicationRequest_DispenseRequest> dispenseRequest();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<Code> intent();

  Optional<Code> language();

  Optional<List<CodeableConcept>> category();

  Optional<List<Reference>> detectedIssue();

  Optional<List<Reference>> supportingInformation();

  Optional<MedicationRequest_Substitution> substitution();

  Optional<Code> status();

  Optional<CodeableConcept> performerType();

  Optional<Meta> meta();

  Optional<Reference> requester();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> statusReason();

  Optional<CodeableConcept> courseOfTherapyType();

  Optional<Code> priority();

  Optional<Reference> recorder();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  String resourceType();

  static ImmutableMedicationRequest.SubjectBuildStage builder() {
    return ImmutableMedicationRequest.builder();
  }
}

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
  Optional<List<Annotation>> note();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<DateTime> authoredOn();

  Optional<List<Reference>> eventHistory();

  Optional<Reference> encounter();

  Optional<Reference> performer();

  Optional<List<Reference>> insurance();

  Optional<Code> language();

  Optional<Reference> reportedReference();

  Optional<Boolean> doNotPerform();

  Optional<Reference> priorPrescription();

  Optional<Reference> requester();

  Optional<Uri> implicitRules();

  Optional<Code> intent();

  Optional<Boolean> reportedBoolean();

  Optional<Reference> medicationReference();

  Optional<List<Reference>> supportingInformation();

  Optional<Reference> recorder();

  Optional<List<Identifier>> identifier();

  Optional<Code> priority();

  Optional<List<Reference>> basedOn();

  Optional<Code> status();

  Optional<List<CodeableConcept>> category();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<CodeableConcept> courseOfTherapyType();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<Reference>> detectedIssue();

  Optional<List<CodeableConcept>> reasonCode();

  Reference subject();

  Optional<List<ResourceList>> contained();

  Optional<MedicationRequest_DispenseRequest> dispenseRequest();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> reasonReference();

  Optional<CodeableConcept> statusReason();

  Optional<Identifier> groupIdentifier();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> performerType();

  Optional<List<Dosage>> dosageInstruction();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<MedicationRequest_Substitution> substitution();

  static ImmutableMedicationRequest.SubjectBuildStage builder() {
    return ImmutableMedicationRequest.builder();
  }
}

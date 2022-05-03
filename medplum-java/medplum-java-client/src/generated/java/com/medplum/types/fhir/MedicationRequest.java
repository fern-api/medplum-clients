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
  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<Identifier> groupIdentifier();

  Optional<List<CodeableConcept>> category();

  Optional<List<Identifier>> identifier();

  Optional<MedicationRequest_Substitution> substitution();

  Optional<List<Reference>> detectedIssue();

  Optional<CodeableConcept> performerType();

  Optional<Reference> performer();

  Optional<Narrative> text();

  Optional<Reference> reportedReference();

  Optional<DateTime> authoredOn();

  Optional<Code> language();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Boolean> doNotPerform();

  Optional<Reference> encounter();

  Optional<Boolean> reportedBoolean();

  Optional<MedicationRequest_DispenseRequest> dispenseRequest();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> reasonReference();

  Optional<Reference> priorPrescription();

  Optional<Code> status();

  Optional<Code> priority();

  Optional<CodeableConcept> courseOfTherapyType();

  Optional<List<Annotation>> note();

  Reference subject();

  Optional<Reference> requester();

  String resourceType();

  Optional<List<Reference>> eventHistory();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<Reference> medicationReference();

  Optional<Id> id();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<ResourceList>> contained();

  Optional<List<Dosage>> dosageInstruction();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> basedOn();

  Optional<Reference> recorder();

  Optional<Code> intent();

  Optional<List<Reference>> supportingInformation();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<List<Reference>> insurance();

  Optional<CodeableConcept> statusReason();

  static ImmutableMedicationRequest.SubjectBuildStage builder() {
    return ImmutableMedicationRequest.builder();
  }
}

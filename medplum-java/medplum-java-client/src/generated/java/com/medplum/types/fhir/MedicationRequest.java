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
  Optional<Uri> implicitRules();

  Optional<List<Reference>> insurance();

  Optional<Reference> encounter();

  Optional<Reference> reportedReference();

  Optional<CodeableConcept> statusReason();

  Optional<CodeableConcept> performerType();

  Optional<Reference> requester();

  Optional<MedicationRequest_DispenseRequest> dispenseRequest();

  Optional<List<ResourceList>> contained();

  Optional<Reference> recorder();

  Optional<Id> id();

  Reference subject();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Code> status();

  Optional<List<Reference>> basedOn();

  Optional<Reference> priorPrescription();

  Optional<CodeableConcept> courseOfTherapyType();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> supportingInformation();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Identifier> groupIdentifier();

  Optional<Reference> performer();

  Optional<List<Identifier>> identifier();

  Optional<List<Uri>> instantiatesUri();

  String resourceType();

  Optional<List<Reference>> detectedIssue();

  Optional<Narrative> text();

  Optional<Boolean> doNotPerform();

  Optional<Boolean> reportedBoolean();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Annotation>> note();

  Optional<Code> priority();

  Optional<Reference> medicationReference();

  Optional<List<Reference>> eventHistory();

  Optional<Code> intent();

  Optional<DateTime> authoredOn();

  Optional<List<CodeableConcept>> category();

  Optional<List<Reference>> reasonReference();

  Optional<MedicationRequest_Substitution> substitution();

  Optional<List<Dosage>> dosageInstruction();

  Optional<Code> language();

  Optional<Meta> meta();

  static ImmutableMedicationRequest.SubjectBuildStage builder() {
    return ImmutableMedicationRequest.builder();
  }
}

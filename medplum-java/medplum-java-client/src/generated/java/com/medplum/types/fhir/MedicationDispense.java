package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMedicationDispense.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationDispense {
  Optional<Uri> implicitRules();

  Optional<CodeableConcept> category();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<Code> status();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<MedicationDispense_Substitution> substitution();

  Optional<List<Reference>> partOf();

  Optional<Quantity> daysSupply();

  Optional<List<Reference>> eventHistory();

  Optional<Reference> subject();

  Optional<List<Reference>> supportingInformation();

  Optional<Reference> location();

  Optional<DateTime> whenPrepared();

  Optional<List<Reference>> receiver();

  Optional<Quantity> quantity();

  Optional<List<MedicationDispense_Performer>> performer();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> type();

  Optional<CodeableConcept> statusReasonCodeableConcept();

  Optional<Reference> statusReasonReference();

  Optional<Id> id();

  Optional<DateTime> whenHandedOver();

  Optional<List<Dosage>> dosageInstruction();

  Optional<List<ResourceList>> contained();

  Optional<Reference> context();

  Optional<List<Reference>> detectedIssue();

  Optional<Reference> medicationReference();

  Optional<Code> language();

  Optional<List<Annotation>> note();

  Optional<Reference> destination();

  Optional<Meta> meta();

  Optional<List<Reference>> authorizingPrescription();

  static ImmutableMedicationDispense.ResourceTypeBuildStage builder() {
    return ImmutableMedicationDispense.builder();
  }
}

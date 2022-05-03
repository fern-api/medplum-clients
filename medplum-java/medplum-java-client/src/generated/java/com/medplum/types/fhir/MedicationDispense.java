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
  Optional<Reference> subject();

  Optional<DateTime> whenPrepared();

  String resourceType();

  Optional<List<MedicationDispense_Performer>> performer();

  Optional<Quantity> quantity();

  Optional<List<Reference>> detectedIssue();

  Optional<CodeableConcept> statusReasonCodeableConcept();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<Reference> destination();

  Optional<MedicationDispense_Substitution> substitution();

  Optional<Reference> medicationReference();

  Optional<List<Reference>> supportingInformation();

  Optional<List<Reference>> eventHistory();

  Optional<List<ResourceList>> contained();

  Optional<List<Annotation>> note();

  Optional<Reference> location();

  Optional<Quantity> daysSupply();

  Optional<DateTime> whenHandedOver();

  Optional<List<Reference>> partOf();

  Optional<List<Dosage>> dosageInstruction();

  Optional<Reference> context();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<Code> status();

  Optional<List<Reference>> receiver();

  Optional<CodeableConcept> category();

  Optional<CodeableConcept> type();

  Optional<Code> language();

  Optional<List<Reference>> authorizingPrescription();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> statusReasonReference();

  Optional<Narrative> text();

  Optional<Id> id();

  static ImmutableMedicationDispense.ResourceTypeBuildStage builder() {
    return ImmutableMedicationDispense.builder();
  }
}

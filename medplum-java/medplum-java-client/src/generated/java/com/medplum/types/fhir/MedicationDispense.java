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
  Optional<List<MedicationDispense_Performer>> performer();

  Optional<CodeableConcept> type();

  Optional<CodeableConcept> statusReasonCodeableConcept();

  Optional<Reference> statusReasonReference();

  Optional<List<Reference>> authorizingPrescription();

  Optional<Code> status();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> receiver();

  Optional<Reference> location();

  String resourceType();

  Optional<Narrative> text();

  Optional<Reference> context();

  Optional<Id> id();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<Dosage>> dosageInstruction();

  Optional<Reference> medicationReference();

  Optional<Quantity> daysSupply();

  Optional<Uri> implicitRules();

  Optional<MedicationDispense_Substitution> substitution();

  Optional<List<Reference>> eventHistory();

  Optional<Quantity> quantity();

  Optional<DateTime> whenPrepared();

  Optional<CodeableConcept> category();

  Optional<List<Annotation>> note();

  Optional<Code> language();

  Optional<Reference> destination();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> supportingInformation();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> detectedIssue();

  Optional<DateTime> whenHandedOver();

  Optional<List<Identifier>> identifier();

  Optional<Reference> subject();

  static ImmutableMedicationDispense.ResourceTypeBuildStage builder() {
    return ImmutableMedicationDispense.builder();
  }
}

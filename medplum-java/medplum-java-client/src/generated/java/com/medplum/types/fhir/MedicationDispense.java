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
  String resourceType();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> statusReasonCodeableConcept();

  Optional<List<Annotation>> note();

  Optional<List<Dosage>> dosageInstruction();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> authorizingPrescription();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<DateTime> whenPrepared();

  Optional<Code> language();

  Optional<List<MedicationDispense_Performer>> performer();

  Optional<CodeableConcept> category();

  Optional<Reference> destination();

  Optional<Quantity> quantity();

  Optional<List<Reference>> receiver();

  Optional<List<Reference>> partOf();

  Optional<Quantity> daysSupply();

  Optional<Reference> medicationReference();

  Optional<Id> id();

  Optional<List<Reference>> eventHistory();

  Optional<Code> status();

  Optional<MedicationDispense_Substitution> substitution();

  Optional<Reference> location();

  Optional<List<ResourceList>> contained();

  Optional<Reference> context();

  Optional<List<Reference>> supportingInformation();

  Optional<List<Reference>> detectedIssue();

  Optional<DateTime> whenHandedOver();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> subject();

  Optional<Reference> statusReasonReference();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> type();

  static ImmutableMedicationDispense.ResourceTypeBuildStage builder() {
    return ImmutableMedicationDispense.builder();
  }
}

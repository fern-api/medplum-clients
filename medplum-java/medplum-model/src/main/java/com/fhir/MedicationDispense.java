package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<Reference>> partOf();

  Optional<code> language();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<dateTime> whenPrepared();

  Optional<CodeableConcept> type();

  Optional<CodeableConcept> category();

  Optional<code> status();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  Optional<id> id();

  Optional<List<Annotation>> note();

  Optional<MedicationDispense_Substitution> substitution();

  Optional<Reference> destination();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<Quantity> daysSupply();

  Optional<Reference> location();

  Optional<Quantity> quantity();

  Optional<CodeableConcept> statusReasonCodeableConcept();

  Optional<Reference> subject();

  Optional<Reference> context();

  Optional<dateTime> whenHandedOver();

  Optional<Reference> statusReasonReference();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<Reference> medicationReference();

  Optional<List<MedicationDispense_Performer>> performer();

  Optional<List<Reference>> supportingInformation();

  Optional<List<Reference>> eventHistory();

  Optional<List<Reference>> authorizingPrescription();

  Optional<List<Dosage>> dosageInstruction();

  Optional<List<Reference>> detectedIssue();

  Optional<uri> implicitRules();

  Optional<List<Reference>> receiver();

  static ImmutableMedicationDispense.ResourceTypeBuildStage builder() {
    return ImmutableMedicationDispense.builder();
  }
}

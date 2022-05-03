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
    as = ImmutableMedicationKnowledge.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge {
  Optional<Reference> manufacturer();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> doseForm();

  Optional<List<CodeableConcept>> intendedRoute();

  Optional<CodeableConcept> code();

  Optional<List<Extension>> modifierExtension();

  Optional<MedicationKnowledge_Packaging> packaging();

  Optional<Uri> implicitRules();

  Optional<Code> status();

  Optional<List<MedicationKnowledge_Kinetics>> kinetics();

  Optional<List<MedicationKnowledge_MedicineClassification>> medicineClassification();

  Optional<List<Reference>> contraindication();

  Optional<List<MedicationKnowledge_Ingredient>> ingredient();

  Optional<Id> id();

  Optional<Quantity> amount();

  Optional<Meta> meta();

  Optional<List<MedicationKnowledge_DrugCharacteristic>> drugCharacteristic();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<List<MedicationKnowledge_Regulatory>> regulatory();

  Optional<List<MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge();

  Optional<List<MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines();

  Optional<List<String>> synonym();

  Optional<List<MedicationKnowledge_Monograph>> monograph();

  Optional<List<Reference>> associatedMedication();

  Optional<List<MedicationKnowledge_Cost>> cost();

  Optional<Code> language();

  Optional<Markdown> preparationInstruction();

  String resourceType();

  Optional<List<CodeableConcept>> productType();

  Optional<List<MedicationKnowledge_MonitoringProgram>> monitoringProgram();

  static ImmutableMedicationKnowledge.ResourceTypeBuildStage builder() {
    return ImmutableMedicationKnowledge.builder();
  }
}

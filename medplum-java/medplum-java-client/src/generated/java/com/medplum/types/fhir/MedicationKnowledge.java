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
  Optional<List<String>> synonym();

  Optional<Meta> meta();

  Optional<List<MedicationKnowledge_DrugCharacteristic>> drugCharacteristic();

  Optional<Code> language();

  String resourceType();

  Optional<List<MedicationKnowledge_Regulatory>> regulatory();

  Optional<Markdown> preparationInstruction();

  Optional<List<CodeableConcept>> intendedRoute();

  Optional<Code> status();

  Optional<List<MedicationKnowledge_Monograph>> monograph();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<Quantity> amount();

  Optional<Id> id();

  Optional<List<MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge();

  Optional<List<MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines();

  Optional<List<Reference>> contraindication();

  Optional<List<CodeableConcept>> productType();

  Optional<List<MedicationKnowledge_Ingredient>> ingredient();

  Optional<List<MedicationKnowledge_Kinetics>> kinetics();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> associatedMedication();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> doseForm();

  Optional<List<MedicationKnowledge_MedicineClassification>> medicineClassification();

  Optional<List<ResourceList>> contained();

  Optional<List<MedicationKnowledge_MonitoringProgram>> monitoringProgram();

  Optional<CodeableConcept> code();

  Optional<Reference> manufacturer();

  Optional<MedicationKnowledge_Packaging> packaging();

  Optional<List<MedicationKnowledge_Cost>> cost();

  static ImmutableMedicationKnowledge.ResourceTypeBuildStage builder() {
    return ImmutableMedicationKnowledge.builder();
  }
}

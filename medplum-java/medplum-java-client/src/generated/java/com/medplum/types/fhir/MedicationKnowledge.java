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
  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<CodeableConcept> code();

  Optional<Narrative> text();

  Optional<List<MedicationKnowledge_Kinetics>> kinetics();

  Optional<List<Reference>> contraindication();

  Optional<Uri> implicitRules();

  Optional<Reference> manufacturer();

  Optional<List<MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines();

  Optional<Meta> meta();

  Optional<List<MedicationKnowledge_Ingredient>> ingredient();

  Optional<Quantity> amount();

  Optional<Id> id();

  Optional<List<CodeableConcept>> intendedRoute();

  Optional<List<MedicationKnowledge_MedicineClassification>> medicineClassification();

  Optional<List<MedicationKnowledge_DrugCharacteristic>> drugCharacteristic();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> associatedMedication();

  Optional<List<MedicationKnowledge_Monograph>> monograph();

  Optional<List<MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge();

  Optional<List<Extension>> extension();

  Optional<Code> status();

  Optional<List<MedicationKnowledge_Cost>> cost();

  Optional<List<MedicationKnowledge_MonitoringProgram>> monitoringProgram();

  Optional<List<CodeableConcept>> productType();

  Optional<MedicationKnowledge_Packaging> packaging();

  Optional<List<String>> synonym();

  Optional<List<MedicationKnowledge_Regulatory>> regulatory();

  Optional<CodeableConcept> doseForm();

  Optional<Markdown> preparationInstruction();

  static ImmutableMedicationKnowledge.ResourceTypeBuildStage builder() {
    return ImmutableMedicationKnowledge.builder();
  }
}

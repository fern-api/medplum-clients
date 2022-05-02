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
  Optional<List<ResourceList>> contained();

  Optional<List<String>> synonym();

  Optional<List<CodeableConcept>> intendedRoute();

  Optional<List<CodeableConcept>> productType();

  String resourceType();

  Optional<CodeableConcept> doseForm();

  Optional<List<MedicationKnowledge_Cost>> cost();

  Optional<List<MedicationKnowledge_DrugCharacteristic>> drugCharacteristic();

  Optional<List<MedicationKnowledge_Ingredient>> ingredient();

  Optional<Code> language();

  Optional<List<Reference>> contraindication();

  Optional<Uri> implicitRules();

  Optional<MedicationKnowledge_Packaging> packaging();

  Optional<List<MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines();

  Optional<List<Reference>> associatedMedication();

  Optional<List<Extension>> extension();

  Optional<List<MedicationKnowledge_Monograph>> monograph();

  Optional<Markdown> preparationInstruction();

  Optional<List<MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> code();

  Optional<List<MedicationKnowledge_MonitoringProgram>> monitoringProgram();

  Optional<Id> id();

  Optional<Reference> manufacturer();

  Optional<List<MedicationKnowledge_MedicineClassification>> medicineClassification();

  Optional<List<MedicationKnowledge_Kinetics>> kinetics();

  Optional<Narrative> text();

  Optional<List<MedicationKnowledge_Regulatory>> regulatory();

  Optional<Code> status();

  Optional<Quantity> amount();

  static ImmutableMedicationKnowledge.ResourceTypeBuildStage builder() {
    return ImmutableMedicationKnowledge.builder();
  }
}

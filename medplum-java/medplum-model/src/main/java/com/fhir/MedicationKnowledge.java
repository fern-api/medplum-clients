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
    as = ImmutableMedicationKnowledge.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge {
  Optional<code> language();

  Optional<List<Reference>> contraindication();

  Optional<id> id();

  Optional<List<Extension>> extension();

  Optional<code> status();

  Optional<List<MedicationKnowledge_Cost>> cost();

  Optional<List<MedicationKnowledge_Regulatory>> regulatory();

  Optional<Narrative> text();

  Optional<List<MedicationKnowledge_AdministrationGuidelines>> administrationGuidelines();

  String resourceType();

  Optional<List<CodeableConcept>> productType();

  Optional<CodeableConcept> doseForm();

  Optional<List<MedicationKnowledge_Ingredient>> ingredient();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> intendedRoute();

  Optional<Reference> manufacturer();

  Optional<List<Reference>> associatedMedication();

  Optional<MedicationKnowledge_Packaging> packaging();

  Optional<List<MedicationKnowledge_MonitoringProgram>> monitoringProgram();

  Optional<List<MedicationKnowledge_MedicineClassification>> medicineClassification();

  Optional<List<String>> synonym();

  Optional<List<MedicationKnowledge_Monograph>> monograph();

  Optional<List<MedicationKnowledge_Kinetics>> kinetics();

  Optional<Quantity> amount();

  Optional<markdown> preparationInstruction();

  Optional<uri> implicitRules();

  Optional<Meta> meta();

  Optional<CodeableConcept> code();

  Optional<List<MedicationKnowledge_DrugCharacteristic>> drugCharacteristic();

  Optional<List<MedicationKnowledge_RelatedMedicationKnowledge>> relatedMedicationKnowledge();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMedicationKnowledge.ResourceTypeBuildStage builder() {
    return ImmutableMedicationKnowledge.builder();
  }
}

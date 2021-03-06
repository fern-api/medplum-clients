import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { markdown } from "./markdown";
import { MedicationKnowledge_AdministrationGuidelines } from "./MedicationKnowledge_AdministrationGuidelines";
import { MedicationKnowledge_Cost } from "./MedicationKnowledge_Cost";
import { MedicationKnowledge_DrugCharacteristic } from "./MedicationKnowledge_DrugCharacteristic";
import { MedicationKnowledge_Ingredient } from "./MedicationKnowledge_Ingredient";
import { MedicationKnowledge_Kinetics } from "./MedicationKnowledge_Kinetics";
import { MedicationKnowledge_MedicineClassification } from "./MedicationKnowledge_MedicineClassification";
import { MedicationKnowledge_MonitoringProgram } from "./MedicationKnowledge_MonitoringProgram";
import { MedicationKnowledge_Monograph } from "./MedicationKnowledge_Monograph";
import { MedicationKnowledge_Packaging } from "./MedicationKnowledge_Packaging";
import { MedicationKnowledge_Regulatory } from "./MedicationKnowledge_Regulatory";
import { MedicationKnowledge_RelatedMedicationKnowledge } from "./MedicationKnowledge_RelatedMedicationKnowledge";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MedicationKnowledge {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept | null | undefined;
    status: code | null | undefined;
    manufacturer: Reference | null | undefined;
    doseForm: CodeableConcept | null | undefined;
    amount: Quantity | null | undefined;
    synonym: string[] | null | undefined;
    relatedMedicationKnowledge:
        | MedicationKnowledge_RelatedMedicationKnowledge[]
        | null
        | undefined;
    associatedMedication: Reference[] | null | undefined;
    productType: CodeableConcept[] | null | undefined;
    monograph: MedicationKnowledge_Monograph[] | null | undefined;
    ingredient: MedicationKnowledge_Ingredient[] | null | undefined;
    preparationInstruction: markdown | null | undefined;
    intendedRoute: CodeableConcept[] | null | undefined;
    cost: MedicationKnowledge_Cost[] | null | undefined;
    monitoringProgram:
        | MedicationKnowledge_MonitoringProgram[]
        | null
        | undefined;
    administrationGuidelines:
        | MedicationKnowledge_AdministrationGuidelines[]
        | null
        | undefined;
    medicineClassification:
        | MedicationKnowledge_MedicineClassification[]
        | null
        | undefined;
    packaging: MedicationKnowledge_Packaging | null | undefined;
    drugCharacteristic:
        | MedicationKnowledge_DrugCharacteristic[]
        | null
        | undefined;
    contraindication: Reference[] | null | undefined;
    regulatory: MedicationKnowledge_Regulatory[] | null | undefined;
    kinetics: MedicationKnowledge_Kinetics[] | null | undefined;
}

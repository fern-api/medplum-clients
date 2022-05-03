import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface MedicationKnowledge_MedicineClassification {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    classification: CodeableConcept[] | null | undefined;
}

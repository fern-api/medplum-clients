import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";

export interface MedicationKnowledge_PatientCharacteristics {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    characteristicCodeableConcept: CodeableConcept | null | undefined;
    characteristicQuantity: Quantity | null | undefined;
    value: string[] | null | undefined;
}

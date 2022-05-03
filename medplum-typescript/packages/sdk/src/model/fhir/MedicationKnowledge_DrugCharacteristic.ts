import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";

export interface MedicationKnowledge_DrugCharacteristic {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept | null | undefined;
    valueCodeableConcept: CodeableConcept | null | undefined;
    valueString: string | null | undefined;
    valueQuantity: Quantity | null | undefined;
    valueBase64Binary: string | null | undefined;
}

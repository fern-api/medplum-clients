import { CodeableConcept } from "./CodeableConcept";
import { Dosage } from "./Dosage";
import { Extension } from "./Extension";

export interface MedicationKnowledge_Dosage {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    dosage: Dosage[];
}

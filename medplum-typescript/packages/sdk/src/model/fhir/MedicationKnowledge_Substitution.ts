import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";

export interface MedicationKnowledge_Substitution {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    allowed: boolean | null | undefined;
}

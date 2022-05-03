import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";

export interface MedicationKnowledge_Schedule {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    schedule: CodeableConcept;
}

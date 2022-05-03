import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";

export interface MedicationKnowledge_MonitoringProgram {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept | null | undefined;
    name: string | null | undefined;
}

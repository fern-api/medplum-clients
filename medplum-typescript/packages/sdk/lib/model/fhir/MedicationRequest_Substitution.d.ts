import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface MedicationRequest_Substitution {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    allowedBoolean: boolean | null | undefined;
    allowedCodeableConcept: CodeableConcept | null | undefined;
    reason: CodeableConcept | null | undefined;
}

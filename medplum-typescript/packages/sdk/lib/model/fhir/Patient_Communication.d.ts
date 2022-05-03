import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface Patient_Communication {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    language: CodeableConcept;
    preferred: boolean | null | undefined;
}

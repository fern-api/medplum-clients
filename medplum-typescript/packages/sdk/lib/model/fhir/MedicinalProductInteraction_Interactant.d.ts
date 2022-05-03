import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface MedicinalProductInteraction_Interactant {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    itemReference: Reference | null | undefined;
    itemCodeableConcept: CodeableConcept | null | undefined;
}

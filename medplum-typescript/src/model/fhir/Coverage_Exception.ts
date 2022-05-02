import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Period } from "./Period";

export interface Coverage_Exception {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    period: Period | null | undefined;
}

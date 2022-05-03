import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface Condition_Stage {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    summary: CodeableConcept | null | undefined;
    assessment: Reference[] | null | undefined;
    type: CodeableConcept | null | undefined;
}

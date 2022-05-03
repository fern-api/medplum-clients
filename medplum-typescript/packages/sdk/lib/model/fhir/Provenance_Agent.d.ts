import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface Provenance_Agent {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept | null | undefined;
    role: CodeableConcept[] | null | undefined;
    who: Reference;
    onBehalfOf: Reference | null | undefined;
}

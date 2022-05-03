import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface Contract_Context {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    reference: Reference | null | undefined;
    code: CodeableConcept[] | null | undefined;
    text: string | null | undefined;
}

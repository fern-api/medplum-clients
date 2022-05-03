import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Reference } from "./Reference";
export interface Composition_Event {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept[] | null | undefined;
    period: Period | null | undefined;
    detail: Reference[] | null | undefined;
}

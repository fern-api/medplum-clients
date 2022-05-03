import { CodeableConcept } from "./CodeableConcept";
import { Expression } from "./Expression";
import { Extension } from "./Extension";
export interface Measure_SupplementalData {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept | null | undefined;
    usage: CodeableConcept[] | null | undefined;
    description: string | null | undefined;
    criteria: Expression;
}

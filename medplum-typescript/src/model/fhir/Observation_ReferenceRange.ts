import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Range } from "./Range";

export interface Observation_ReferenceRange {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    low: Quantity | null | undefined;
    high: Quantity | null | undefined;
    type: CodeableConcept | null | undefined;
    appliesTo: CodeableConcept[] | null | undefined;
    age: Range | null | undefined;
    text: string | null | undefined;
}

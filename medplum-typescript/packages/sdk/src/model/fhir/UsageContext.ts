import { CodeableConcept } from "./CodeableConcept";
import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Range } from "./Range";
import { Reference } from "./Reference";

export interface UsageContext {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    code: Coding;
    valueCodeableConcept: CodeableConcept | null | undefined;
    valueQuantity: Quantity | null | undefined;
    valueRange: Range | null | undefined;
    valueReference: Reference | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Range } from "./Range";
export interface SupplyRequest_Parameter {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept | null | undefined;
    valueCodeableConcept: CodeableConcept | null | undefined;
    valueQuantity: Quantity | null | undefined;
    valueRange: Range | null | undefined;
    valueBoolean: boolean | null | undefined;
}

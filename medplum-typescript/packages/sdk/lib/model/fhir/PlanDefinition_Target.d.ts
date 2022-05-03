import { CodeableConcept } from "./CodeableConcept";
import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Range } from "./Range";
export interface PlanDefinition_Target {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    measure: CodeableConcept | null | undefined;
    detailQuantity: Quantity | null | undefined;
    detailRange: Range | null | undefined;
    detailCodeableConcept: CodeableConcept | null | undefined;
    due: Duration | null | undefined;
}

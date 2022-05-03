import { CodeableConcept } from "./CodeableConcept";
import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Range } from "./Range";
import { Ratio } from "./Ratio";
export interface Goal_Target {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    measure: CodeableConcept | null | undefined;
    detailQuantity: Quantity | null | undefined;
    detailRange: Range | null | undefined;
    detailCodeableConcept: CodeableConcept | null | undefined;
    detailString: string | null | undefined;
    detailBoolean: boolean | null | undefined;
    detailInteger: number | null | undefined;
    detailRatio: Ratio | null | undefined;
    dueDate: string | null | undefined;
    dueDuration: Duration | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Quantity } from "./Quantity";
import { Range } from "./Range";
import { Reference } from "./Reference";

export interface Group_Characteristic {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept;
    valueCodeableConcept: CodeableConcept | null | undefined;
    valueBoolean: boolean | null | undefined;
    valueQuantity: Quantity | null | undefined;
    valueRange: Range | null | undefined;
    valueReference: Reference | null | undefined;
    exclude: boolean | null | undefined;
    period: Period | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Range } from "./Range";
import { Ratio } from "./Ratio";
export interface Dosage_DoseAndRate {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept | null | undefined;
    doseRange: Range | null | undefined;
    doseQuantity: Quantity | null | undefined;
    rateRatio: Ratio | null | undefined;
    rateRange: Range | null | undefined;
    rateQuantity: Quantity | null | undefined;
}

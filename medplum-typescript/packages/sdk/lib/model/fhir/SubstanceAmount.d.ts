import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Range } from "./Range";
import { SubstanceAmount_ReferenceRange } from "./SubstanceAmount_ReferenceRange";
export interface SubstanceAmount {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    amountQuantity: Quantity | null | undefined;
    amountRange: Range | null | undefined;
    amountString: string | null | undefined;
    amountType: CodeableConcept | null | undefined;
    amountText: string | null | undefined;
    referenceRange: SubstanceAmount_ReferenceRange | null | undefined;
}

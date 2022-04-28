import { Extension } from "./Extension";
import { Quantity } from "./Quantity";

export interface SubstanceAmount_ReferenceRange {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    lowLimit: Quantity | null | undefined;
    highLimit: Quantity | null | undefined;
}

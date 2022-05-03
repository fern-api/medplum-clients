import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
export interface Ratio {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    numerator: Quantity | null | undefined;
    denominator: Quantity | null | undefined;
}

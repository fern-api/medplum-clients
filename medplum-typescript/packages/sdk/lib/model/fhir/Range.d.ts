import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
export interface Range {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    low: Quantity | null | undefined;
    high: Quantity | null | undefined;
}

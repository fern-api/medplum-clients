import { code } from "./code";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { QuantityComparator } from "./QuantityComparator";
import { uri } from "./uri";

export interface Quantity {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    value: decimal | null | undefined;
    comparator: QuantityComparator | null | undefined;
    unit: string | null | undefined;
    system: uri | null | undefined;
    code: code | null | undefined;
}

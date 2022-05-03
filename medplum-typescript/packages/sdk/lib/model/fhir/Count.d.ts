import { code } from "./code";
import { CountComparator } from "./CountComparator";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { uri } from "./uri";
export interface Count {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    value: decimal | null | undefined;
    comparator: CountComparator | null | undefined;
    unit: string | null | undefined;
    system: uri | null | undefined;
    code: code | null | undefined;
}

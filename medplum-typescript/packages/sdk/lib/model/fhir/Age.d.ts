import { AgeComparator } from "./AgeComparator";
import { code } from "./code";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { uri } from "./uri";
export interface Age {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    value: decimal | null | undefined;
    comparator: AgeComparator | null | undefined;
    unit: string | null | undefined;
    system: uri | null | undefined;
    code: code | null | undefined;
}

import { code } from "./code";
import { decimal } from "./decimal";
import { DurationComparator } from "./DurationComparator";
import { Extension } from "./Extension";
import { uri } from "./uri";
export interface Duration {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    value: decimal | null | undefined;
    comparator: DurationComparator | null | undefined;
    unit: string | null | undefined;
    system: uri | null | undefined;
    code: code | null | undefined;
}

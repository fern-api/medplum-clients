import { code } from "./code";
import { decimal } from "./decimal";
import { DistanceComparator } from "./DistanceComparator";
import { Extension } from "./Extension";
import { uri } from "./uri";

export interface Distance {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    value: decimal | null | undefined;
    comparator: DistanceComparator | null | undefined;
    unit: string | null | undefined;
    system: uri | null | undefined;
    code: code | null | undefined;
}

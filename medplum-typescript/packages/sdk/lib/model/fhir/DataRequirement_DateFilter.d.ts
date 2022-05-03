import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { Period } from "./Period";
export interface DataRequirement_DateFilter {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    path: string | null | undefined;
    searchParam: string | null | undefined;
    valueDateTime: string | null | undefined;
    valuePeriod: Period | null | undefined;
    valueDuration: Duration | null | undefined;
}

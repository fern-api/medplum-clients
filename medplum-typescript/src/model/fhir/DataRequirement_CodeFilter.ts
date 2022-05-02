import { canonical } from "./canonical";
import { Coding } from "./Coding";
import { Extension } from "./Extension";

export interface DataRequirement_CodeFilter {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    path: string | null | undefined;
    searchParam: string | null | undefined;
    valueSet: canonical | null | undefined;
    code: Coding[] | null | undefined;
}

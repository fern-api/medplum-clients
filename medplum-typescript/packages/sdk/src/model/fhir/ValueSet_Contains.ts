import { code } from "./code";
import { Extension } from "./Extension";
import { uri } from "./uri";
import { ValueSet_Designation } from "./ValueSet_Designation";

export interface ValueSet_Contains {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    system: uri | null | undefined;
    abstract: boolean | null | undefined;
    inactive: boolean | null | undefined;
    version: string | null | undefined;
    code: code | null | undefined;
    display: string | null | undefined;
    designation: ValueSet_Designation[] | null | undefined;
    contains: ValueSet_Contains[] | null | undefined;
}

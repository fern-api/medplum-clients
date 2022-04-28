import { code } from "./code";
import { Extension } from "./Extension";
import { ValueSet_Designation } from "./ValueSet_Designation";

export interface ValueSet_Concept {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: code | null | undefined;
    display: string | null | undefined;
    designation: ValueSet_Designation[] | null | undefined;
}

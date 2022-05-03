import { code } from "./code";
import { Coding } from "./Coding";
import { Extension } from "./Extension";

export interface CodeSystem_Designation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    language: code | null | undefined;
    use: Coding | null | undefined;
    value: string | null | undefined;
}

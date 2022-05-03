import { Coding } from "./Coding";
import { Extension } from "./Extension";
export interface TestScript_Destination {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    index: number | null | undefined;
    profile: Coding;
}

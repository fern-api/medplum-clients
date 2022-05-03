import { code } from "./code";
import { Extension } from "./Extension";
import { uri } from "./uri";
export interface Coding {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    system: uri | null | undefined;
    version: string | null | undefined;
    code: code | null | undefined;
    display: string | null | undefined;
    userSelected: boolean | null | undefined;
}

import { Extension } from "./Extension";

export interface TestScript_RequestHeader {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    field: string | null | undefined;
    value: string | null | undefined;
}

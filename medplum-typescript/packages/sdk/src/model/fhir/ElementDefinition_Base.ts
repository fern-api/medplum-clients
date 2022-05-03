import { Extension } from "./Extension";
import { unsignedInt } from "./unsignedInt";

export interface ElementDefinition_Base {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    path: string | null | undefined;
    min: unsignedInt | null | undefined;
    max: string | null | undefined;
}

import { canonical } from "./canonical";
import { code } from "./code";
import { Extension } from "./Extension";
import { unsignedInt } from "./unsignedInt";
export interface MessageDefinition_Focus {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: code | null | undefined;
    profile: canonical | null | undefined;
    min: unsignedInt | null | undefined;
    max: string | null | undefined;
}

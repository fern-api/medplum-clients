import { canonical } from "./canonical";
import { Extension } from "./Extension";
import { markdown } from "./markdown";
export interface MessageDefinition_AllowedResponse {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    message: canonical;
    situation: markdown | null | undefined;
}

import { canonical } from "./canonical";
import { Extension } from "./Extension";
import { markdown } from "./markdown";
export interface CapabilityStatement_Operation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    definition: canonical;
    documentation: markdown | null | undefined;
}

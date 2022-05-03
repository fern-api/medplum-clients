import { canonical } from "./canonical";
import { Capabilitystatement_documentMode } from "./Capabilitystatement_documentMode";
import { Extension } from "./Extension";
import { markdown } from "./markdown";
export interface CapabilityStatement_Document {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    mode: Capabilitystatement_documentMode | null | undefined;
    documentation: markdown | null | undefined;
    profile: canonical;
}

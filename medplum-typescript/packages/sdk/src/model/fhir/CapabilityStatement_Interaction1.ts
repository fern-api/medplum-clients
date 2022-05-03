import { Capabilitystatement_interaction1Code } from "./Capabilitystatement_interaction1Code";
import { Extension } from "./Extension";
import { markdown } from "./markdown";

export interface CapabilityStatement_Interaction1 {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: Capabilitystatement_interaction1Code | null | undefined;
    documentation: markdown | null | undefined;
}

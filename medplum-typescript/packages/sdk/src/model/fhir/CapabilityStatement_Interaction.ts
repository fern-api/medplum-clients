import { Capabilitystatement_interactionCode } from "./Capabilitystatement_interactionCode";
import { Extension } from "./Extension";
import { markdown } from "./markdown";

export interface CapabilityStatement_Interaction {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: Capabilitystatement_interactionCode | null | undefined;
    documentation: markdown | null | undefined;
}

import { canonical } from "./canonical";
import { Capabilitystatement_supportedmessageMode } from "./Capabilitystatement_supportedmessageMode";
import { Extension } from "./Extension";
export interface CapabilityStatement_SupportedMessage {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    mode: Capabilitystatement_supportedmessageMode | null | undefined;
    definition: canonical;
}

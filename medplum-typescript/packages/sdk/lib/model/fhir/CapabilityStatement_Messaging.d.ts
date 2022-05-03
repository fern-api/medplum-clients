import { CapabilityStatement_Endpoint } from "./CapabilityStatement_Endpoint";
import { CapabilityStatement_SupportedMessage } from "./CapabilityStatement_SupportedMessage";
import { Extension } from "./Extension";
import { markdown } from "./markdown";
import { unsignedInt } from "./unsignedInt";
export interface CapabilityStatement_Messaging {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    endpoint: CapabilityStatement_Endpoint[] | null | undefined;
    reliableCache: unsignedInt | null | undefined;
    documentation: markdown | null | undefined;
    supportedMessage: CapabilityStatement_SupportedMessage[] | null | undefined;
}

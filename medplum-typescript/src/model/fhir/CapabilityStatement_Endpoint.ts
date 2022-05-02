import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { url } from "./url";

export interface CapabilityStatement_Endpoint {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    protocol: Coding;
    address: url | null | undefined;
}

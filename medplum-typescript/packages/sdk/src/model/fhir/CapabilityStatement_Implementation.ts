import { Extension } from "./Extension";
import { Reference } from "./Reference";
import { url } from "./url";

export interface CapabilityStatement_Implementation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    description: string | null | undefined;
    url: url | null | undefined;
    custodian: Reference | null | undefined;
}

import { Extension } from "./Extension";
import { url } from "./url";

export interface TerminologyCapabilities_Implementation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    description: string | null | undefined;
    url: url | null | undefined;
}

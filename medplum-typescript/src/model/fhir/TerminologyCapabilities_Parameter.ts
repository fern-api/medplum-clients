import { code } from "./code";
import { Extension } from "./Extension";

export interface TerminologyCapabilities_Parameter {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: code | null | undefined;
    documentation: string | null | undefined;
}

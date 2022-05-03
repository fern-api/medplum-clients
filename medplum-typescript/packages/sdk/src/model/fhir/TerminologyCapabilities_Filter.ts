import { code } from "./code";
import { Extension } from "./Extension";

export interface TerminologyCapabilities_Filter {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: code | null | undefined;
    op: code[] | null | undefined;
}

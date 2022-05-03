import { Extension } from "./Extension";
import { markdown } from "./markdown";
import { TerminologyCapabilities_Parameter } from "./TerminologyCapabilities_Parameter";

export interface TerminologyCapabilities_Expansion {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    hierarchical: boolean | null | undefined;
    paging: boolean | null | undefined;
    incomplete: boolean | null | undefined;
    parameter: TerminologyCapabilities_Parameter[] | null | undefined;
    textFilter: markdown | null | undefined;
}

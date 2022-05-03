import { code } from "./code";
import { Extension } from "./Extension";
import { TerminologyCapabilities_Filter } from "./TerminologyCapabilities_Filter";

export interface TerminologyCapabilities_Version {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: string | null | undefined;
    isDefault: boolean | null | undefined;
    compositional: boolean | null | undefined;
    language: code[] | null | undefined;
    filter: TerminologyCapabilities_Filter[] | null | undefined;
    property: code[] | null | undefined;
}

import { canonical } from "./canonical";
import { Extension } from "./Extension";
import { TerminologyCapabilities_Version } from "./TerminologyCapabilities_Version";

export interface TerminologyCapabilities_CodeSystem {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    uri: canonical | null | undefined;
    version: TerminologyCapabilities_Version[] | null | undefined;
    subsumption: boolean | null | undefined;
}

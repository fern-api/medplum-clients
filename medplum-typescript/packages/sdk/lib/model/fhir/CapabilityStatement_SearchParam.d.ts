import { canonical } from "./canonical";
import { Capabilitystatement_searchparamType } from "./Capabilitystatement_searchparamType";
import { Extension } from "./Extension";
import { markdown } from "./markdown";
export interface CapabilityStatement_SearchParam {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    definition: canonical | null | undefined;
    type: Capabilitystatement_searchparamType | null | undefined;
    documentation: markdown | null | undefined;
}

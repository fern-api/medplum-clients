import { canonical } from "./canonical";
import { CapabilityStatement_Interaction } from "./CapabilityStatement_Interaction";
import { CapabilityStatement_Operation } from "./CapabilityStatement_Operation";
import { Capabilitystatement_resourceConditionaldelete } from "./Capabilitystatement_resourceConditionaldelete";
import { Capabilitystatement_resourceConditionalread } from "./Capabilitystatement_resourceConditionalread";
import { Capabilitystatement_resourceReferencepolicyItem } from "./Capabilitystatement_resourceReferencepolicyItem";
import { Capabilitystatement_resourceVersioning } from "./Capabilitystatement_resourceVersioning";
import { CapabilityStatement_SearchParam } from "./CapabilityStatement_SearchParam";
import { code } from "./code";
import { Extension } from "./Extension";
import { markdown } from "./markdown";

export interface CapabilityStatement_Resource {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: code | null | undefined;
    profile: canonical | null | undefined;
    supportedProfile: canonical[] | null | undefined;
    documentation: markdown | null | undefined;
    interaction: CapabilityStatement_Interaction[] | null | undefined;
    versioning: Capabilitystatement_resourceVersioning | null | undefined;
    readHistory: boolean | null | undefined;
    updateCreate: boolean | null | undefined;
    conditionalCreate: boolean | null | undefined;
    conditionalRead:
        | Capabilitystatement_resourceConditionalread
        | null
        | undefined;
    conditionalUpdate: boolean | null | undefined;
    conditionalDelete:
        | Capabilitystatement_resourceConditionaldelete
        | null
        | undefined;
    referencePolicy:
        | Capabilitystatement_resourceReferencepolicyItem[]
        | null
        | undefined;
    searchInclude: string[] | null | undefined;
    searchRevInclude: string[] | null | undefined;
    searchParam: CapabilityStatement_SearchParam[] | null | undefined;
    operation: CapabilityStatement_Operation[] | null | undefined;
}

import { canonical } from "./canonical";
import { CapabilityStatement_Interaction1 } from "./CapabilityStatement_Interaction1";
import { CapabilityStatement_Operation } from "./CapabilityStatement_Operation";
import { CapabilityStatement_Resource } from "./CapabilityStatement_Resource";
import { Capabilitystatement_restMode } from "./Capabilitystatement_restMode";
import { CapabilityStatement_SearchParam } from "./CapabilityStatement_SearchParam";
import { CapabilityStatement_Security } from "./CapabilityStatement_Security";
import { Extension } from "./Extension";
import { markdown } from "./markdown";

export interface CapabilityStatement_Rest {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    mode: Capabilitystatement_restMode | null | undefined;
    documentation: markdown | null | undefined;
    security: CapabilityStatement_Security | null | undefined;
    resource: CapabilityStatement_Resource[] | null | undefined;
    interaction: CapabilityStatement_Interaction1[] | null | undefined;
    searchParam: CapabilityStatement_SearchParam[] | null | undefined;
    operation: CapabilityStatement_Operation[] | null | undefined;
    compartment: canonical[] | null | undefined;
}

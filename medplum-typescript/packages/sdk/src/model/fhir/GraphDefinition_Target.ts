import { canonical } from "./canonical";
import { code } from "./code";
import { Extension } from "./Extension";
import { GraphDefinition_Compartment } from "./GraphDefinition_Compartment";
import { GraphDefinition_Link } from "./GraphDefinition_Link";

export interface GraphDefinition_Target {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: code | null | undefined;
    params: string | null | undefined;
    profile: canonical | null | undefined;
    compartment: GraphDefinition_Compartment[] | null | undefined;
    link: GraphDefinition_Link[] | null | undefined;
}

import { code } from "./code";
import { Extension } from "./Extension";
import { Graphdefinition_compartmentRule } from "./Graphdefinition_compartmentRule";
import { Graphdefinition_compartmentUse } from "./Graphdefinition_compartmentUse";

export interface GraphDefinition_Compartment {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    use: Graphdefinition_compartmentUse | null | undefined;
    code: code | null | undefined;
    rule: Graphdefinition_compartmentRule | null | undefined;
    expression: string | null | undefined;
    description: string | null | undefined;
}

import { Expression } from "./Expression";
import { Extension } from "./Extension";
import { Plandefinition_conditionKind } from "./Plandefinition_conditionKind";

export interface PlanDefinition_Condition {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    kind: Plandefinition_conditionKind | null | undefined;
    expression: Expression | null | undefined;
}

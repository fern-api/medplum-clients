import { Expression } from "./Expression";
import { Extension } from "./Extension";

export interface PlanDefinition_DynamicValue {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    path: string | null | undefined;
    expression: Expression | null | undefined;
}

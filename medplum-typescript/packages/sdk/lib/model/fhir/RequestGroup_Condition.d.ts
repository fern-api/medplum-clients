import { code } from "./code";
import { Expression } from "./Expression";
import { Extension } from "./Extension";
export interface RequestGroup_Condition {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    kind: code | null | undefined;
    expression: Expression | null | undefined;
}

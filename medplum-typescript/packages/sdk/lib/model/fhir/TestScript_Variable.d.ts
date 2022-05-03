import { Extension } from "./Extension";
import { id } from "./id";
export interface TestScript_Variable {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    defaultValue: string | null | undefined;
    description: string | null | undefined;
    expression: string | null | undefined;
    headerField: string | null | undefined;
    hint: string | null | undefined;
    path: string | null | undefined;
    sourceId: id | null | undefined;
}

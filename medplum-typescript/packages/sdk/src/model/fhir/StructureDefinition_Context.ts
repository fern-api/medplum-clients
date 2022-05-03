import { Extension } from "./Extension";
import { Structuredefinition_contextType } from "./Structuredefinition_contextType";

export interface StructureDefinition_Context {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Structuredefinition_contextType | null | undefined;
    expression: string | null | undefined;
}

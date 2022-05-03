import { code } from "./code";
import { Extension } from "./Extension";

export interface CompartmentDefinition_Resource {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: code | null | undefined;
    param: string[] | null | undefined;
    documentation: string | null | undefined;
}

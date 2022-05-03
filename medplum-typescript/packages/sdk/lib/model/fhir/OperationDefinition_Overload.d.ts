import { Extension } from "./Extension";
export interface OperationDefinition_Overload {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    parameterName: string[] | null | undefined;
    comment: string | null | undefined;
}

import { Extension } from "./Extension";

export interface ChargeItemDefinition_Applicability {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    description: string | null | undefined;
    language: string | null | undefined;
    expression: string | null | undefined;
}

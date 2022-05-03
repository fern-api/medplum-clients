import { Extension } from "./Extension";
import { Implementationguide_parameterCode } from "./Implementationguide_parameterCode";

export interface ImplementationGuide_Parameter {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: Implementationguide_parameterCode | null | undefined;
    value: string | null | undefined;
}

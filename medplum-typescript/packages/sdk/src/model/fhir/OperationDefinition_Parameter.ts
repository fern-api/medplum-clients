import { canonical } from "./canonical";
import { code } from "./code";
import { Extension } from "./Extension";
import { OperationDefinition_Binding } from "./OperationDefinition_Binding";
import { Operationdefinition_parameterSearchtype } from "./Operationdefinition_parameterSearchtype";
import { Operationdefinition_parameterUse } from "./Operationdefinition_parameterUse";
import { OperationDefinition_ReferencedFrom } from "./OperationDefinition_ReferencedFrom";

export interface OperationDefinition_Parameter {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: code | null | undefined;
    use: Operationdefinition_parameterUse | null | undefined;
    min: number | null | undefined;
    max: string | null | undefined;
    documentation: string | null | undefined;
    type: code | null | undefined;
    targetProfile: canonical[] | null | undefined;
    searchType: Operationdefinition_parameterSearchtype | null | undefined;
    binding: OperationDefinition_Binding | null | undefined;
    referencedFrom: OperationDefinition_ReferencedFrom[] | null | undefined;
    part: OperationDefinition_Parameter[] | null | undefined;
}

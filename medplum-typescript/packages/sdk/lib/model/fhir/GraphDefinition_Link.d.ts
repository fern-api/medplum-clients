import { Extension } from "./Extension";
import { GraphDefinition_Target } from "./GraphDefinition_Target";
export interface GraphDefinition_Link {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    path: string | null | undefined;
    sliceName: string | null | undefined;
    min: number | null | undefined;
    max: string | null | undefined;
    description: string | null | undefined;
    target: GraphDefinition_Target[] | null | undefined;
}

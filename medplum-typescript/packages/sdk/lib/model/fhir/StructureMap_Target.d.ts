import { Extension } from "./Extension";
import { id } from "./id";
import { StructureMap_Parameter } from "./StructureMap_Parameter";
import { Structuremap_targetContexttype } from "./Structuremap_targetContexttype";
import { Structuremap_targetListmodeItem } from "./Structuremap_targetListmodeItem";
import { Structuremap_targetTransform } from "./Structuremap_targetTransform";
export interface StructureMap_Target {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    context: id | null | undefined;
    contextType: Structuremap_targetContexttype | null | undefined;
    element: string | null | undefined;
    variable: id | null | undefined;
    listMode: Structuremap_targetListmodeItem[] | null | undefined;
    listRuleId: id | null | undefined;
    transform: Structuremap_targetTransform | null | undefined;
    parameter: StructureMap_Parameter[] | null | undefined;
}

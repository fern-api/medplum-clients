import { Extension } from "./Extension";
import { id } from "./id";
import { StructureMap_Dependent } from "./StructureMap_Dependent";
import { StructureMap_Source } from "./StructureMap_Source";
import { StructureMap_Target } from "./StructureMap_Target";
export interface StructureMap_Rule {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: id | null | undefined;
    source: StructureMap_Source[];
    target: StructureMap_Target[] | null | undefined;
    rule: StructureMap_Rule[] | null | undefined;
    dependent: StructureMap_Dependent[] | null | undefined;
    documentation: string | null | undefined;
}

import { Extension } from "./Extension";
import { id } from "./id";
import { Structuremap_groupTypemode } from "./Structuremap_groupTypemode";
import { StructureMap_Input } from "./StructureMap_Input";
import { StructureMap_Rule } from "./StructureMap_Rule";

export interface StructureMap_Group {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: id | null | undefined;
    extends: id | null | undefined;
    typeMode: Structuremap_groupTypemode | null | undefined;
    documentation: string | null | undefined;
    input: StructureMap_Input[];
    rule: StructureMap_Rule[];
}

import { Extension } from "./Extension";
import { id } from "./id";
import { Structuremap_inputMode } from "./Structuremap_inputMode";

export interface StructureMap_Input {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: id | null | undefined;
    type: string | null | undefined;
    mode: Structuremap_inputMode | null | undefined;
    documentation: string | null | undefined;
}

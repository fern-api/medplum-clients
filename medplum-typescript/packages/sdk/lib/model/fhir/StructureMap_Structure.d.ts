import { canonical } from "./canonical";
import { Extension } from "./Extension";
import { Structuremap_structureMode } from "./Structuremap_structureMode";
export interface StructureMap_Structure {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    url: canonical;
    mode: Structuremap_structureMode | null | undefined;
    alias: string | null | undefined;
    documentation: string | null | undefined;
}

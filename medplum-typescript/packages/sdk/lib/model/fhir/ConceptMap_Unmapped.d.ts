import { canonical } from "./canonical";
import { code } from "./code";
import { Conceptmap_unmappedMode } from "./Conceptmap_unmappedMode";
import { Extension } from "./Extension";
export interface ConceptMap_Unmapped {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    mode: Conceptmap_unmappedMode | null | undefined;
    code: code | null | undefined;
    display: string | null | undefined;
    url: canonical | null | undefined;
}

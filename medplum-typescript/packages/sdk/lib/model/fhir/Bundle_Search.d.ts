import { Bundle_searchMode } from "./Bundle_searchMode";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
export interface Bundle_Search {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    mode: Bundle_searchMode | null | undefined;
    score: decimal | null | undefined;
}

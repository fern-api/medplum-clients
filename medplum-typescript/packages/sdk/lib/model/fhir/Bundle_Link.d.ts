import { Extension } from "./Extension";
import { uri } from "./uri";
export interface Bundle_Link {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    relation: string | null | undefined;
    url: uri | null | undefined;
}

import { Extension } from "./Extension";
import { uri } from "./uri";
export interface TestScript_Link {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    url: uri | null | undefined;
    description: string | null | undefined;
}

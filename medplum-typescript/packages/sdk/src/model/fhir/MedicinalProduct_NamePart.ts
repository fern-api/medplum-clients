import { Coding } from "./Coding";
import { Extension } from "./Extension";

export interface MedicinalProduct_NamePart {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    part: string | null | undefined;
    type: Coding;
}

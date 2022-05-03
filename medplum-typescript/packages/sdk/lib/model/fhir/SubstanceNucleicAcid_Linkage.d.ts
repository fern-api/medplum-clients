import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
export interface SubstanceNucleicAcid_Linkage {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    connectivity: string | null | undefined;
    identifier: Identifier | null | undefined;
    name: string | null | undefined;
    residueSite: string | null | undefined;
}

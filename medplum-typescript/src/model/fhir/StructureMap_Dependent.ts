import { Extension } from "./Extension";
import { id } from "./id";

export interface StructureMap_Dependent {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: id | null | undefined;
    variable: string[] | null | undefined;
}

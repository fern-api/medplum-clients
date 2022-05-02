import { Extension } from "./Extension";
import { id } from "./id";
import { uri } from "./uri";

export interface StructureDefinition_Mapping {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identity: id | null | undefined;
    uri: uri | null | undefined;
    name: string | null | undefined;
    comment: string | null | undefined;
}

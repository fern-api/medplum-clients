import { code } from "./code";
import { Extension } from "./Extension";
import { id } from "./id";

export interface ElementDefinition_Mapping {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identity: id | null | undefined;
    language: code | null | undefined;
    map: string | null | undefined;
    comment: string | null | undefined;
}

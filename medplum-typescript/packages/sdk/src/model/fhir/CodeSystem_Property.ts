import { code } from "./code";
import { Codesystem_propertyType } from "./Codesystem_propertyType";
import { Extension } from "./Extension";
import { uri } from "./uri";

export interface CodeSystem_Property {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: code | null | undefined;
    uri: uri | null | undefined;
    description: string | null | undefined;
    type: Codesystem_propertyType | null | undefined;
}

import { canonical } from "./canonical";
import { Extension } from "./Extension";
import { uri } from "./uri";
export interface ConceptMap_DependsOn {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    property: uri | null | undefined;
    system: canonical | null | undefined;
    value: string | null | undefined;
    display: string | null | undefined;
}

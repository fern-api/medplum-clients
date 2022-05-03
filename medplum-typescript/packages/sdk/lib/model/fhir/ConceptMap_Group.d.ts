import { ConceptMap_Element } from "./ConceptMap_Element";
import { ConceptMap_Unmapped } from "./ConceptMap_Unmapped";
import { Extension } from "./Extension";
import { uri } from "./uri";
export interface ConceptMap_Group {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    source: uri | null | undefined;
    sourceVersion: string | null | undefined;
    target: uri | null | undefined;
    targetVersion: string | null | undefined;
    element: ConceptMap_Element[];
    unmapped: ConceptMap_Unmapped | null | undefined;
}

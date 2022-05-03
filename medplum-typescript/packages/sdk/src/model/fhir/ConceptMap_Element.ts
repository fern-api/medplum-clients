import { code } from "./code";
import { ConceptMap_Target } from "./ConceptMap_Target";
import { Extension } from "./Extension";

export interface ConceptMap_Element {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: code | null | undefined;
    display: string | null | undefined;
    target: ConceptMap_Target[] | null | undefined;
}

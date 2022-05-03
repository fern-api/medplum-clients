import { code } from "./code";
import { ConceptMap_DependsOn } from "./ConceptMap_DependsOn";
import { Conceptmap_targetEquivalence } from "./Conceptmap_targetEquivalence";
import { Extension } from "./Extension";

export interface ConceptMap_Target {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: code | null | undefined;
    display: string | null | undefined;
    equivalence: Conceptmap_targetEquivalence | null | undefined;
    comment: string | null | undefined;
    dependsOn: ConceptMap_DependsOn[] | null | undefined;
    product: ConceptMap_DependsOn[] | null | undefined;
}

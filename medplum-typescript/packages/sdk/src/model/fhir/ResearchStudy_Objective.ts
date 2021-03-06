import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";

export interface ResearchStudy_Objective {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    type: CodeableConcept | null | undefined;
}

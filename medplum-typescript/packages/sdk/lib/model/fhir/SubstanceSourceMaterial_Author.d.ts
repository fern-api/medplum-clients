import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface SubstanceSourceMaterial_Author {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    authorType: CodeableConcept | null | undefined;
    authorDescription: string | null | undefined;
}

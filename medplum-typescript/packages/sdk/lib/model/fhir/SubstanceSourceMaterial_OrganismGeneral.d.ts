import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface SubstanceSourceMaterial_OrganismGeneral {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    kingdom: CodeableConcept | null | undefined;
    phylum: CodeableConcept | null | undefined;
    class: CodeableConcept | null | undefined;
    order: CodeableConcept | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { SubstanceSourceMaterial_Author } from "./SubstanceSourceMaterial_Author";
import { SubstanceSourceMaterial_Hybrid } from "./SubstanceSourceMaterial_Hybrid";
import { SubstanceSourceMaterial_OrganismGeneral } from "./SubstanceSourceMaterial_OrganismGeneral";

export interface SubstanceSourceMaterial_Organism {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    family: CodeableConcept | null | undefined;
    genus: CodeableConcept | null | undefined;
    species: CodeableConcept | null | undefined;
    intraspecificType: CodeableConcept | null | undefined;
    intraspecificDescription: string | null | undefined;
    author: SubstanceSourceMaterial_Author[] | null | undefined;
    hybrid: SubstanceSourceMaterial_Hybrid | null | undefined;
    organismGeneral: SubstanceSourceMaterial_OrganismGeneral | null | undefined;
}

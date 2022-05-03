import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface SubstanceSourceMaterial_Hybrid {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    maternalOrganismId: string | null | undefined;
    maternalOrganismName: string | null | undefined;
    paternalOrganismId: string | null | undefined;
    paternalOrganismName: string | null | undefined;
    hybridType: CodeableConcept | null | undefined;
}

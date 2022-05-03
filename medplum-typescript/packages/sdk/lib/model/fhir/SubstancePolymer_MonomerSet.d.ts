import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { SubstancePolymer_StartingMaterial } from "./SubstancePolymer_StartingMaterial";
export interface SubstancePolymer_MonomerSet {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    ratioType: CodeableConcept | null | undefined;
    startingMaterial: SubstancePolymer_StartingMaterial[] | null | undefined;
}

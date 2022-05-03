import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { MedicinalProductIngredient_Strength } from "./MedicinalProductIngredient_Strength";
export interface MedicinalProductIngredient_Substance {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept;
    strength: MedicinalProductIngredient_Strength[] | null | undefined;
}

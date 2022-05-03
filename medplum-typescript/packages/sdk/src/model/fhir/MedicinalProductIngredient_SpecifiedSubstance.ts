import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { MedicinalProductIngredient_Strength } from "./MedicinalProductIngredient_Strength";

export interface MedicinalProductIngredient_SpecifiedSubstance {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept;
    group: CodeableConcept;
    confidentiality: CodeableConcept | null | undefined;
    strength: MedicinalProductIngredient_Strength[] | null | undefined;
}

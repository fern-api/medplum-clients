import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Ratio } from "./Ratio";
export interface MedicinalProductIngredient_ReferenceStrength {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    substance: CodeableConcept | null | undefined;
    strength: Ratio;
    strengthLowLimit: Ratio | null | undefined;
    measurementPoint: string | null | undefined;
    country: CodeableConcept[] | null | undefined;
}

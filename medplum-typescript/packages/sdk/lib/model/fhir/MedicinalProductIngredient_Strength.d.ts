import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { MedicinalProductIngredient_ReferenceStrength } from "./MedicinalProductIngredient_ReferenceStrength";
import { Ratio } from "./Ratio";
export interface MedicinalProductIngredient_Strength {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    presentation: Ratio;
    presentationLowLimit: Ratio | null | undefined;
    concentration: Ratio | null | undefined;
    concentrationLowLimit: Ratio | null | undefined;
    measurementPoint: string | null | undefined;
    country: CodeableConcept[] | null | undefined;
    referenceStrength: MedicinalProductIngredient_ReferenceStrength[] | null | undefined;
}

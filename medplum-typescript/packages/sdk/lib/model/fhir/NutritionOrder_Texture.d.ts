import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface NutritionOrder_Texture {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    modifier: CodeableConcept | null | undefined;
    foodType: CodeableConcept | null | undefined;
}

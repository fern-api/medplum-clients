import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";

export interface NutritionOrder_Nutrient {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    modifier: CodeableConcept | null | undefined;
    amount: Quantity | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { NutritionOrder_Nutrient } from "./NutritionOrder_Nutrient";
import { NutritionOrder_Texture } from "./NutritionOrder_Texture";
import { Timing } from "./Timing";

export interface NutritionOrder_OralDiet {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept[] | null | undefined;
    schedule: Timing[] | null | undefined;
    nutrient: NutritionOrder_Nutrient[] | null | undefined;
    texture: NutritionOrder_Texture[] | null | undefined;
    fluidConsistencyType: CodeableConcept[] | null | undefined;
    instruction: string | null | undefined;
}

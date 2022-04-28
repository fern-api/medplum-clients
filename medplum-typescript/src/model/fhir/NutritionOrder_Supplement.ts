import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Timing } from "./Timing";

export interface NutritionOrder_Supplement {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept | null | undefined;
    productName: string | null | undefined;
    schedule: Timing[] | null | undefined;
    quantity: Quantity | null | undefined;
    instruction: string | null | undefined;
}

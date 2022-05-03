import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Ratio } from "./Ratio";
import { Timing } from "./Timing";
export interface NutritionOrder_Administration {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    schedule: Timing | null | undefined;
    quantity: Quantity | null | undefined;
    rateQuantity: Quantity | null | undefined;
    rateRatio: Ratio | null | undefined;
}

import { ChargeItemDefinition_Applicability } from "./ChargeItemDefinition_Applicability";
import { ChargeItemDefinition_PriceComponent } from "./ChargeItemDefinition_PriceComponent";
import { Extension } from "./Extension";
export interface ChargeItemDefinition_PropertyGroup {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    applicability: ChargeItemDefinition_Applicability[] | null | undefined;
    priceComponent: ChargeItemDefinition_PriceComponent[] | null | undefined;
}

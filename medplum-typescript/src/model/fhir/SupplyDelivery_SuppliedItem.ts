import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";

export interface SupplyDelivery_SuppliedItem {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    quantity: Quantity | null | undefined;
    itemCodeableConcept: CodeableConcept | null | undefined;
    itemReference: Reference | null | undefined;
}

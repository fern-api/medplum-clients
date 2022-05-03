import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Invoice_PriceComponent } from "./Invoice_PriceComponent";
import { positiveInt } from "./positiveInt";
import { Reference } from "./Reference";
export interface Invoice_LineItem {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    sequence: positiveInt | null | undefined;
    chargeItemReference: Reference | null | undefined;
    chargeItemCodeableConcept: CodeableConcept | null | undefined;
    priceComponent: Invoice_PriceComponent[] | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { Invoice_pricecomponentType } from "./Invoice_pricecomponentType";
import { Money } from "./Money";
export interface Invoice_PriceComponent {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Invoice_pricecomponentType | null | undefined;
    code: CodeableConcept | null | undefined;
    factor: decimal | null | undefined;
    amount: Money | null | undefined;
}

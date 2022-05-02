import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { Money } from "./Money";

export interface ChargeItemDefinition_PriceComponent {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: code | null | undefined;
    code: CodeableConcept | null | undefined;
    factor: decimal | null | undefined;
    amount: Money | null | undefined;
}

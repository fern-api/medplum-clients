import { CodeableConcept } from "./CodeableConcept";
import { date } from "./date";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Money } from "./Money";

export interface ExplanationOfBenefit_Payment {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept | null | undefined;
    adjustment: Money | null | undefined;
    adjustmentReason: CodeableConcept | null | undefined;
    date: date | null | undefined;
    amount: Money | null | undefined;
    identifier: Identifier | null | undefined;
}

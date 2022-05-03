import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { ExplanationOfBenefit_Adjudication } from "./ExplanationOfBenefit_Adjudication";
import { Extension } from "./Extension";
import { Money } from "./Money";
import { positiveInt } from "./positiveInt";
import { Quantity } from "./Quantity";

export interface ExplanationOfBenefit_SubDetail1 {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    productOrService: CodeableConcept;
    modifier: CodeableConcept[] | null | undefined;
    quantity: Quantity | null | undefined;
    unitPrice: Money | null | undefined;
    factor: decimal | null | undefined;
    net: Money | null | undefined;
    noteNumber: positiveInt[] | null | undefined;
    adjudication: ExplanationOfBenefit_Adjudication[] | null | undefined;
}

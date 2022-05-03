import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { Money } from "./Money";
export interface ExplanationOfBenefit_Adjudication {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    category: CodeableConcept;
    reason: CodeableConcept | null | undefined;
    amount: Money | null | undefined;
    value: decimal | null | undefined;
}

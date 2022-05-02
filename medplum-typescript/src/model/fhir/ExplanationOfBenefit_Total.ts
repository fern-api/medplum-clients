import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Money } from "./Money";

export interface ExplanationOfBenefit_Total {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    category: CodeableConcept;
    amount: Money;
}

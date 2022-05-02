import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { ExplanationOfBenefit_Adjudication } from "./ExplanationOfBenefit_Adjudication";
import { ExplanationOfBenefit_SubDetail } from "./ExplanationOfBenefit_SubDetail";
import { Extension } from "./Extension";
import { Money } from "./Money";
import { positiveInt } from "./positiveInt";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";

export interface ExplanationOfBenefit_Detail {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    sequence: positiveInt | null | undefined;
    revenue: CodeableConcept | null | undefined;
    category: CodeableConcept | null | undefined;
    productOrService: CodeableConcept;
    modifier: CodeableConcept[] | null | undefined;
    programCode: CodeableConcept[] | null | undefined;
    quantity: Quantity | null | undefined;
    unitPrice: Money | null | undefined;
    factor: decimal | null | undefined;
    net: Money | null | undefined;
    udi: Reference[] | null | undefined;
    noteNumber: positiveInt[] | null | undefined;
    adjudication: ExplanationOfBenefit_Adjudication[] | null | undefined;
    subDetail: ExplanationOfBenefit_SubDetail[] | null | undefined;
}

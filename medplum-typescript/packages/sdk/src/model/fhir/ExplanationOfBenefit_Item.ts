import { Address } from "./Address";
import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { ExplanationOfBenefit_Adjudication } from "./ExplanationOfBenefit_Adjudication";
import { ExplanationOfBenefit_Detail } from "./ExplanationOfBenefit_Detail";
import { Extension } from "./Extension";
import { Money } from "./Money";
import { Period } from "./Period";
import { positiveInt } from "./positiveInt";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";

export interface ExplanationOfBenefit_Item {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    sequence: positiveInt | null | undefined;
    careTeamSequence: positiveInt[] | null | undefined;
    diagnosisSequence: positiveInt[] | null | undefined;
    procedureSequence: positiveInt[] | null | undefined;
    informationSequence: positiveInt[] | null | undefined;
    revenue: CodeableConcept | null | undefined;
    category: CodeableConcept | null | undefined;
    productOrService: CodeableConcept;
    modifier: CodeableConcept[] | null | undefined;
    programCode: CodeableConcept[] | null | undefined;
    servicedDate: string | null | undefined;
    servicedPeriod: Period | null | undefined;
    locationCodeableConcept: CodeableConcept | null | undefined;
    locationAddress: Address | null | undefined;
    locationReference: Reference | null | undefined;
    quantity: Quantity | null | undefined;
    unitPrice: Money | null | undefined;
    factor: decimal | null | undefined;
    net: Money | null | undefined;
    udi: Reference[] | null | undefined;
    bodySite: CodeableConcept | null | undefined;
    subSite: CodeableConcept[] | null | undefined;
    encounter: Reference[] | null | undefined;
    noteNumber: positiveInt[] | null | undefined;
    adjudication: ExplanationOfBenefit_Adjudication[] | null | undefined;
    detail: ExplanationOfBenefit_Detail[] | null | undefined;
}

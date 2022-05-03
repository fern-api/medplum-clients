import { Address } from "./Address";
import { CodeableConcept } from "./CodeableConcept";
import { date } from "./date";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface ExplanationOfBenefit_Accident {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    date: date | null | undefined;
    type: CodeableConcept | null | undefined;
    locationAddress: Address | null | undefined;
    locationReference: Reference | null | undefined;
}

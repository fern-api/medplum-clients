import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
export interface InsurancePlan_Cost {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    applicability: CodeableConcept | null | undefined;
    qualifiers: CodeableConcept[] | null | undefined;
    value: Quantity | null | undefined;
}

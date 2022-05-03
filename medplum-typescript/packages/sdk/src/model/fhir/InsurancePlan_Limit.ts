import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";

export interface InsurancePlan_Limit {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    value: Quantity | null | undefined;
    code: CodeableConcept | null | undefined;
}

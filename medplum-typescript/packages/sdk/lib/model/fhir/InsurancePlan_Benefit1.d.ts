import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { InsurancePlan_Cost } from "./InsurancePlan_Cost";
export interface InsurancePlan_Benefit1 {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    cost: InsurancePlan_Cost[] | null | undefined;
}

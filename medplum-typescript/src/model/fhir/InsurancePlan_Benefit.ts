import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { InsurancePlan_Limit } from "./InsurancePlan_Limit";

export interface InsurancePlan_Benefit {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    requirement: string | null | undefined;
    limit: InsurancePlan_Limit[] | null | undefined;
}

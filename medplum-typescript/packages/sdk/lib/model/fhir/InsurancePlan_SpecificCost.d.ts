import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { InsurancePlan_Benefit1 } from "./InsurancePlan_Benefit1";
export interface InsurancePlan_SpecificCost {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    category: CodeableConcept;
    benefit: InsurancePlan_Benefit1[] | null | undefined;
}

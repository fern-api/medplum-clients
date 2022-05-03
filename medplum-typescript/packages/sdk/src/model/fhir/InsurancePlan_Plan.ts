import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { InsurancePlan_GeneralCost } from "./InsurancePlan_GeneralCost";
import { InsurancePlan_SpecificCost } from "./InsurancePlan_SpecificCost";
import { Reference } from "./Reference";

export interface InsurancePlan_Plan {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    type: CodeableConcept | null | undefined;
    coverageArea: Reference[] | null | undefined;
    network: Reference[] | null | undefined;
    generalCost: InsurancePlan_GeneralCost[] | null | undefined;
    specificCost: InsurancePlan_SpecificCost[] | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { InsurancePlan_Benefit } from "./InsurancePlan_Benefit";
import { Reference } from "./Reference";

export interface InsurancePlan_Coverage {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    network: Reference[] | null | undefined;
    benefit: InsurancePlan_Benefit[];
}

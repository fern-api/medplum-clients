import { Address } from "./Address";
import { CodeableConcept } from "./CodeableConcept";
import { ContactPoint } from "./ContactPoint";
import { Extension } from "./Extension";
import { HumanName } from "./HumanName";

export interface InsurancePlan_Contact {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    purpose: CodeableConcept | null | undefined;
    name: HumanName | null | undefined;
    telecom: ContactPoint[] | null | undefined;
    address: Address | null | undefined;
}

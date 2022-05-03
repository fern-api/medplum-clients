import { Address } from "./Address";
import { CodeableConcept } from "./CodeableConcept";
import { ContactPoint } from "./ContactPoint";
import { Extension } from "./Extension";
import { HumanName } from "./HumanName";
import { Patient_contactGender } from "./Patient_contactGender";
import { Period } from "./Period";
import { Reference } from "./Reference";

export interface Patient_Contact {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    relationship: CodeableConcept[] | null | undefined;
    name: HumanName | null | undefined;
    telecom: ContactPoint[] | null | undefined;
    address: Address | null | undefined;
    gender: Patient_contactGender | null | undefined;
    organization: Reference | null | undefined;
    period: Period | null | undefined;
}

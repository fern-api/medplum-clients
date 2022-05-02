import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface Claim_Payee {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    party: Reference | null | undefined;
}

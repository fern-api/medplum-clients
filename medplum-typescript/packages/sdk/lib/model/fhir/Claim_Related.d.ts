import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Reference } from "./Reference";
export interface Claim_Related {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    claim: Reference | null | undefined;
    relationship: CodeableConcept | null | undefined;
    reference: Identifier | null | undefined;
}

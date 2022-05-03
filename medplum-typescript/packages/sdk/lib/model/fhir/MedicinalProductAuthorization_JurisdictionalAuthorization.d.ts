import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Period } from "./Period";
export interface MedicinalProductAuthorization_JurisdictionalAuthorization {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    country: CodeableConcept | null | undefined;
    jurisdiction: CodeableConcept[] | null | undefined;
    legalStatusOfSupply: CodeableConcept | null | undefined;
    validityPeriod: Period | null | undefined;
}

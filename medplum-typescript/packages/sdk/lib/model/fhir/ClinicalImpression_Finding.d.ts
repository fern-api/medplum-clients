import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface ClinicalImpression_Finding {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    itemCodeableConcept: CodeableConcept | null | undefined;
    itemReference: Reference | null | undefined;
    basis: string | null | undefined;
}

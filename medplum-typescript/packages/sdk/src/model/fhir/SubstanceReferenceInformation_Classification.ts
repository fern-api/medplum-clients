import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface SubstanceReferenceInformation_Classification {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    domain: CodeableConcept | null | undefined;
    classification: CodeableConcept | null | undefined;
    subtype: CodeableConcept[] | null | undefined;
    source: Reference[] | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface SubstanceReferenceInformation_Gene {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    geneSequenceOrigin: CodeableConcept | null | undefined;
    gene: CodeableConcept | null | undefined;
    source: Reference[] | null | undefined;
}

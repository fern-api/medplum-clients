import { Attachment } from "./Attachment";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface SubstancePolymer_StructuralRepresentation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept | null | undefined;
    representation: string | null | undefined;
    attachment: Attachment | null | undefined;
}

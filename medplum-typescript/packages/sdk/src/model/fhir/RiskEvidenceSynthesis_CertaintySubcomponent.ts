import { Annotation } from "./Annotation";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";

export interface RiskEvidenceSynthesis_CertaintySubcomponent {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept | null | undefined;
    rating: CodeableConcept[] | null | undefined;
    note: Annotation[] | null | undefined;
}

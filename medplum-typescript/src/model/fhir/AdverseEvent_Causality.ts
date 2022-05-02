import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface AdverseEvent_Causality {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    assessment: CodeableConcept | null | undefined;
    productRelatedness: string | null | undefined;
    author: Reference | null | undefined;
    method: CodeableConcept | null | undefined;
}

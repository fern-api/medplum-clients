import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface SpecimenDefinition_Additive {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    additiveCodeableConcept: CodeableConcept | null | undefined;
    additiveReference: Reference | null | undefined;
}

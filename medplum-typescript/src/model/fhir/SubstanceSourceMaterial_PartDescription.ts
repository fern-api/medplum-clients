import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";

export interface SubstanceSourceMaterial_PartDescription {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    part: CodeableConcept | null | undefined;
    partLocation: CodeableConcept | null | undefined;
}

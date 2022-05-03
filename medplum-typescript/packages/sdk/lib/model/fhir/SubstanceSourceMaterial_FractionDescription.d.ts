import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface SubstanceSourceMaterial_FractionDescription {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    fraction: string | null | undefined;
    materialType: CodeableConcept | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Ratio } from "./Ratio";
import { Reference } from "./Reference";

export interface Medication_Ingredient {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    itemCodeableConcept: CodeableConcept | null | undefined;
    itemReference: Reference | null | undefined;
    isActive: boolean | null | undefined;
    strength: Ratio | null | undefined;
}

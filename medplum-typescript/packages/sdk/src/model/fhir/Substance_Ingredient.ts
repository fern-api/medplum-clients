import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Ratio } from "./Ratio";
import { Reference } from "./Reference";

export interface Substance_Ingredient {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    quantity: Ratio | null | undefined;
    substanceCodeableConcept: CodeableConcept | null | undefined;
    substanceReference: Reference | null | undefined;
}

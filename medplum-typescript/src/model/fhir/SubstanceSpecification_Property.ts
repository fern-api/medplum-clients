import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";

export interface SubstanceSpecification_Property {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    category: CodeableConcept | null | undefined;
    code: CodeableConcept | null | undefined;
    parameters: string | null | undefined;
    definingSubstanceReference: Reference | null | undefined;
    definingSubstanceCodeableConcept: CodeableConcept | null | undefined;
    amountQuantity: Quantity | null | undefined;
    amountString: string | null | undefined;
}

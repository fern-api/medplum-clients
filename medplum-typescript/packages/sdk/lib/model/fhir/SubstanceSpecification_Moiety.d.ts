import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Quantity } from "./Quantity";
export interface SubstanceSpecification_Moiety {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    role: CodeableConcept | null | undefined;
    identifier: Identifier | null | undefined;
    name: string | null | undefined;
    stereochemistry: CodeableConcept | null | undefined;
    opticalActivity: CodeableConcept | null | undefined;
    molecularFormula: string | null | undefined;
    amountQuantity: Quantity | null | undefined;
    amountString: string | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";

export interface SubstanceSpecification_MolecularWeight {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    method: CodeableConcept | null | undefined;
    type: CodeableConcept | null | undefined;
    amount: Quantity | null | undefined;
}

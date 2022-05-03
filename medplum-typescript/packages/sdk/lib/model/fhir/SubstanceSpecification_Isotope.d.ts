import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Quantity } from "./Quantity";
import { SubstanceSpecification_MolecularWeight } from "./SubstanceSpecification_MolecularWeight";
export interface SubstanceSpecification_Isotope {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier | null | undefined;
    name: CodeableConcept | null | undefined;
    substitution: CodeableConcept | null | undefined;
    halfLife: Quantity | null | undefined;
    molecularWeight: SubstanceSpecification_MolecularWeight | null | undefined;
}

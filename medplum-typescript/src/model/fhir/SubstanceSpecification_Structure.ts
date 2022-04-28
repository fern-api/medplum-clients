import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
import { SubstanceSpecification_Isotope } from "./SubstanceSpecification_Isotope";
import { SubstanceSpecification_MolecularWeight } from "./SubstanceSpecification_MolecularWeight";
import { SubstanceSpecification_Representation } from "./SubstanceSpecification_Representation";

export interface SubstanceSpecification_Structure {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    stereochemistry: CodeableConcept | null | undefined;
    opticalActivity: CodeableConcept | null | undefined;
    molecularFormula: string | null | undefined;
    molecularFormulaByMoiety: string | null | undefined;
    isotope: SubstanceSpecification_Isotope[] | null | undefined;
    molecularWeight: SubstanceSpecification_MolecularWeight | null | undefined;
    source: Reference[] | null | undefined;
    representation: SubstanceSpecification_Representation[] | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { SubstancePolymer_RepeatUnit } from "./SubstancePolymer_RepeatUnit";

export interface SubstancePolymer_Repeat {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    numberOfUnits: number | null | undefined;
    averageMolecularFormula: string | null | undefined;
    repeatUnitAmountType: CodeableConcept | null | undefined;
    repeatUnit: SubstancePolymer_RepeatUnit[] | null | undefined;
}

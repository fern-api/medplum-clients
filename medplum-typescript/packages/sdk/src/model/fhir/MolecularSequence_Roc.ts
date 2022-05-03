import { decimal } from "./decimal";
import { Extension } from "./Extension";

export interface MolecularSequence_Roc {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    score: number[] | null | undefined;
    numTP: number[] | null | undefined;
    numFP: number[] | null | undefined;
    numFN: number[] | null | undefined;
    precision: decimal[] | null | undefined;
    sensitivity: decimal[] | null | undefined;
    fMeasure: decimal[] | null | undefined;
}

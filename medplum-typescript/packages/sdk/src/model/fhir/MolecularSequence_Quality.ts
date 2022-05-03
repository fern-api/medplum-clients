import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { Molecularsequence_qualityType } from "./Molecularsequence_qualityType";
import { MolecularSequence_Roc } from "./MolecularSequence_Roc";
import { Quantity } from "./Quantity";

export interface MolecularSequence_Quality {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Molecularsequence_qualityType | null | undefined;
    standardSequence: CodeableConcept | null | undefined;
    start: number | null | undefined;
    end: number | null | undefined;
    score: Quantity | null | undefined;
    method: CodeableConcept | null | undefined;
    truthTP: decimal | null | undefined;
    queryTP: decimal | null | undefined;
    truthFN: decimal | null | undefined;
    queryFP: decimal | null | undefined;
    gtFP: decimal | null | undefined;
    precision: decimal | null | undefined;
    recall: decimal | null | undefined;
    fScore: decimal | null | undefined;
    roc: MolecularSequence_Roc | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { RiskEvidenceSynthesis_PrecisionEstimate } from "./RiskEvidenceSynthesis_PrecisionEstimate";

export interface RiskEvidenceSynthesis_RiskEstimate {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    description: string | null | undefined;
    type: CodeableConcept | null | undefined;
    value: decimal | null | undefined;
    unitOfMeasure: CodeableConcept | null | undefined;
    denominatorCount: number | null | undefined;
    numeratorCount: number | null | undefined;
    precisionEstimate:
        | RiskEvidenceSynthesis_PrecisionEstimate[]
        | null
        | undefined;
}

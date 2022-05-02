import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Range } from "./Range";

export interface RiskAssessment_Prediction {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    outcome: CodeableConcept | null | undefined;
    probabilityDecimal: number | null | undefined;
    probabilityRange: Range | null | undefined;
    qualitativeRisk: CodeableConcept | null | undefined;
    relativeRisk: decimal | null | undefined;
    whenPeriod: Period | null | undefined;
    whenRange: Range | null | undefined;
    rationale: string | null | undefined;
}

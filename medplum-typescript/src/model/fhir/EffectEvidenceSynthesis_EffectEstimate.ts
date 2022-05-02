import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { EffectEvidenceSynthesis_PrecisionEstimate } from "./EffectEvidenceSynthesis_PrecisionEstimate";
import { Extension } from "./Extension";

export interface EffectEvidenceSynthesis_EffectEstimate {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    description: string | null | undefined;
    type: CodeableConcept | null | undefined;
    variantState: CodeableConcept | null | undefined;
    value: decimal | null | undefined;
    unitOfMeasure: CodeableConcept | null | undefined;
    precisionEstimate:
        | EffectEvidenceSynthesis_PrecisionEstimate[]
        | null
        | undefined;
}

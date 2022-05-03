import { CodeableConcept } from "./CodeableConcept";
import { decimal } from "./decimal";
import { Extension } from "./Extension";
export interface EffectEvidenceSynthesis_PrecisionEstimate {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept | null | undefined;
    level: decimal | null | undefined;
    from: decimal | null | undefined;
    to: decimal | null | undefined;
}

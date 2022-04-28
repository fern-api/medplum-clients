import { Annotation } from "./Annotation";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { RiskEvidenceSynthesis_CertaintySubcomponent } from "./RiskEvidenceSynthesis_CertaintySubcomponent";

export interface RiskEvidenceSynthesis_Certainty {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    rating: CodeableConcept[] | null | undefined;
    note: Annotation[] | null | undefined;
    certaintySubcomponent: RiskEvidenceSynthesis_CertaintySubcomponent[] | null | undefined;
}

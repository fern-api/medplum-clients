import { Annotation } from "./Annotation";
import { CodeableConcept } from "./CodeableConcept";
import { EffectEvidenceSynthesis_CertaintySubcomponent } from "./EffectEvidenceSynthesis_CertaintySubcomponent";
import { Extension } from "./Extension";

export interface EffectEvidenceSynthesis_Certainty {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    rating: CodeableConcept[] | null | undefined;
    note: Annotation[] | null | undefined;
    certaintySubcomponent:
        | EffectEvidenceSynthesis_CertaintySubcomponent[]
        | null
        | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { Effectevidencesynthesis_resultsbyexposureExposurestate } from "./Effectevidencesynthesis_resultsbyexposureExposurestate";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface EffectEvidenceSynthesis_ResultsByExposure {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    description: string | null | undefined;
    exposureState: Effectevidencesynthesis_resultsbyexposureExposurestate | null | undefined;
    variantState: CodeableConcept | null | undefined;
    riskEvidenceSynthesis: Reference;
}

import { Extension } from "./Extension";

export interface EffectEvidenceSynthesis_SampleSize {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    description: string | null | undefined;
    numberOfStudies: number | null | undefined;
    numberOfParticipants: number | null | undefined;
}

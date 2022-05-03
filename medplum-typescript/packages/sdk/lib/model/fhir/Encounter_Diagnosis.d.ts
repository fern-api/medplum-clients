import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";
import { Reference } from "./Reference";
export interface Encounter_Diagnosis {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    condition: Reference;
    use: CodeableConcept | null | undefined;
    rank: positiveInt | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";
import { Reference } from "./Reference";
export interface Claim_Diagnosis {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    sequence: positiveInt | null | undefined;
    diagnosisCodeableConcept: CodeableConcept | null | undefined;
    diagnosisReference: Reference | null | undefined;
    type: CodeableConcept[] | null | undefined;
    onAdmission: CodeableConcept | null | undefined;
    packageCode: CodeableConcept | null | undefined;
}

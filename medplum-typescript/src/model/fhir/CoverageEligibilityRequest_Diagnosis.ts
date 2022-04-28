import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface CoverageEligibilityRequest_Diagnosis {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    diagnosisCodeableConcept: CodeableConcept | null | undefined;
    diagnosisReference: Reference | null | undefined;
}

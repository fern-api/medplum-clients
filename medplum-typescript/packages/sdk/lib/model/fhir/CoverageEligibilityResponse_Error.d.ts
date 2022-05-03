import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
export interface CoverageEligibilityResponse_Error {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept;
}

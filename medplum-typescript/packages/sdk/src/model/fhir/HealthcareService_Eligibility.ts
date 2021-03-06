import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { markdown } from "./markdown";

export interface HealthcareService_Eligibility {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept | null | undefined;
    comment: markdown | null | undefined;
}

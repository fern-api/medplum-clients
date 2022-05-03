import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface VerificationResult_PrimarySource {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    who: Reference | null | undefined;
    type: CodeableConcept[] | null | undefined;
    communicationMethod: CodeableConcept[] | null | undefined;
    validationStatus: CodeableConcept | null | undefined;
    validationDate: dateTime | null | undefined;
    canPushUpdates: CodeableConcept | null | undefined;
    pushTypeAvailable: CodeableConcept[] | null | undefined;
}

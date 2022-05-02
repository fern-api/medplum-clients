import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Reference } from "./Reference";

export interface DocumentReference_Context {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    encounter: Reference[] | null | undefined;
    event: CodeableConcept[] | null | undefined;
    period: Period | null | undefined;
    facilityType: CodeableConcept | null | undefined;
    practiceSetting: CodeableConcept | null | undefined;
    sourcePatientInfo: Reference | null | undefined;
    related: Reference[] | null | undefined;
}

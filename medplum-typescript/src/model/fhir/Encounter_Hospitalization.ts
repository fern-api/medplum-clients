import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Identifier } from "./Identifier";
import { Reference } from "./Reference";

export interface Encounter_Hospitalization {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    preAdmissionIdentifier: Identifier | null | undefined;
    origin: Reference | null | undefined;
    admitSource: CodeableConcept | null | undefined;
    reAdmission: CodeableConcept | null | undefined;
    dietPreference: CodeableConcept[] | null | undefined;
    specialCourtesy: CodeableConcept[] | null | undefined;
    specialArrangement: CodeableConcept[] | null | undefined;
    destination: Reference | null | undefined;
    dischargeDisposition: CodeableConcept | null | undefined;
}

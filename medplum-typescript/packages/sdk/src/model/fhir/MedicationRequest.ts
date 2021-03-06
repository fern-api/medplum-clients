import { Annotation } from "./Annotation";
import { canonical } from "./canonical";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Dosage } from "./Dosage";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { MedicationRequest_DispenseRequest } from "./MedicationRequest_DispenseRequest";
import { MedicationRequest_Substitution } from "./MedicationRequest_Substitution";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MedicationRequest {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    status: code | null | undefined;
    statusReason: CodeableConcept | null | undefined;
    intent: code | null | undefined;
    category: CodeableConcept[] | null | undefined;
    priority: code | null | undefined;
    doNotPerform: boolean | null | undefined;
    reportedBoolean: boolean | null | undefined;
    reportedReference: Reference | null | undefined;
    medicationCodeableConcept: CodeableConcept | null | undefined;
    medicationReference: Reference | null | undefined;
    subject: Reference;
    encounter: Reference | null | undefined;
    supportingInformation: Reference[] | null | undefined;
    authoredOn: dateTime | null | undefined;
    requester: Reference | null | undefined;
    performer: Reference | null | undefined;
    performerType: CodeableConcept | null | undefined;
    recorder: Reference | null | undefined;
    reasonCode: CodeableConcept[] | null | undefined;
    reasonReference: Reference[] | null | undefined;
    instantiatesCanonical: canonical[] | null | undefined;
    instantiatesUri: uri[] | null | undefined;
    basedOn: Reference[] | null | undefined;
    groupIdentifier: Identifier | null | undefined;
    courseOfTherapyType: CodeableConcept | null | undefined;
    insurance: Reference[] | null | undefined;
    note: Annotation[] | null | undefined;
    dosageInstruction: Dosage[] | null | undefined;
    dispenseRequest: MedicationRequest_DispenseRequest | null | undefined;
    substitution: MedicationRequest_Substitution | null | undefined;
    priorPrescription: Reference | null | undefined;
    detectedIssue: Reference[] | null | undefined;
    eventHistory: Reference[] | null | undefined;
}

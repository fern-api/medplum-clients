import { Annotation } from "./Annotation";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { CommunicationRequest_Payload } from "./CommunicationRequest_Payload";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface CommunicationRequest {
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
    basedOn: Reference[] | null | undefined;
    replaces: Reference[] | null | undefined;
    groupIdentifier: Identifier | null | undefined;
    status: code | null | undefined;
    statusReason: CodeableConcept | null | undefined;
    category: CodeableConcept[] | null | undefined;
    priority: code | null | undefined;
    doNotPerform: boolean | null | undefined;
    medium: CodeableConcept[] | null | undefined;
    subject: Reference | null | undefined;
    about: Reference[] | null | undefined;
    encounter: Reference | null | undefined;
    payload: CommunicationRequest_Payload[] | null | undefined;
    occurrenceDateTime: string | null | undefined;
    occurrencePeriod: Period | null | undefined;
    authoredOn: dateTime | null | undefined;
    requester: Reference | null | undefined;
    recipient: Reference[] | null | undefined;
    sender: Reference | null | undefined;
    reasonCode: CodeableConcept[] | null | undefined;
    reasonReference: Reference[] | null | undefined;
    note: Annotation[] | null | undefined;
}
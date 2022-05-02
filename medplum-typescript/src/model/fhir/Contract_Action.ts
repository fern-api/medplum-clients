import { Annotation } from "./Annotation";
import { CodeableConcept } from "./CodeableConcept";
import { Contract_Subject } from "./Contract_Subject";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { Timing } from "./Timing";
import { unsignedInt } from "./unsignedInt";

export interface Contract_Action {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    doNotPerform: boolean | null | undefined;
    type: CodeableConcept;
    subject: Contract_Subject[] | null | undefined;
    intent: CodeableConcept;
    linkId: string[] | null | undefined;
    status: CodeableConcept;
    context: Reference | null | undefined;
    contextLinkId: string[] | null | undefined;
    occurrenceDateTime: string | null | undefined;
    occurrencePeriod: Period | null | undefined;
    occurrenceTiming: Timing | null | undefined;
    requester: Reference[] | null | undefined;
    requesterLinkId: string[] | null | undefined;
    performerType: CodeableConcept[] | null | undefined;
    performerRole: CodeableConcept | null | undefined;
    performer: Reference | null | undefined;
    performerLinkId: string[] | null | undefined;
    reasonCode: CodeableConcept[] | null | undefined;
    reasonReference: Reference[] | null | undefined;
    reason: string[] | null | undefined;
    reasonLinkId: string[] | null | undefined;
    note: Annotation[] | null | undefined;
    securityLabelNumber: unsignedInt[] | null | undefined;
}

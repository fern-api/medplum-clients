import { AuditEvent_Network } from "./AuditEvent_Network";
import { CodeableConcept } from "./CodeableConcept";
import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
import { uri } from "./uri";

export interface AuditEvent_Agent {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept | null | undefined;
    role: CodeableConcept[] | null | undefined;
    who: Reference | null | undefined;
    altId: string | null | undefined;
    name: string | null | undefined;
    requestor: boolean | null | undefined;
    location: Reference | null | undefined;
    policy: uri[] | null | undefined;
    media: Coding | null | undefined;
    network: AuditEvent_Network | null | undefined;
    purposeOfUse: CodeableConcept[] | null | undefined;
}

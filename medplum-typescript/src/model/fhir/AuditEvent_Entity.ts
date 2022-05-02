import { AuditEvent_Detail } from "./AuditEvent_Detail";
import { base64Binary } from "./base64Binary";
import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface AuditEvent_Entity {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    what: Reference | null | undefined;
    type: Coding | null | undefined;
    role: Coding | null | undefined;
    lifecycle: Coding | null | undefined;
    securityLabel: Coding[] | null | undefined;
    name: string | null | undefined;
    description: string | null | undefined;
    query: base64Binary | null | undefined;
    detail: AuditEvent_Detail[] | null | undefined;
}

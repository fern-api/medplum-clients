import { AuditeventAction } from "./AuditeventAction";
import { AuditeventOutcome } from "./AuditeventOutcome";
import { AuditEvent_Agent } from "./AuditEvent_Agent";
import { AuditEvent_Entity } from "./AuditEvent_Entity";
import { AuditEvent_Source } from "./AuditEvent_Source";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { id } from "./id";
import { instant } from "./instant";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface AuditEvent {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Coding;
    subtype: Coding[] | null | undefined;
    action: AuditeventAction | null | undefined;
    period: Period | null | undefined;
    recorded: instant | null | undefined;
    outcome: AuditeventOutcome | null | undefined;
    outcomeDesc: string | null | undefined;
    purposeOfEvent: CodeableConcept[] | null | undefined;
    agent: AuditEvent_Agent[];
    source: AuditEvent_Source;
    entity: AuditEvent_Entity[] | null | undefined;
}

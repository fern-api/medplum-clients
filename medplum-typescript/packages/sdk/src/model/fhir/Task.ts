import { Annotation } from "./Annotation";
import { canonical } from "./canonical";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { TaskIntent } from "./TaskIntent";
import { TaskStatus } from "./TaskStatus";
import { Task_Input } from "./Task_Input";
import { Task_Output } from "./Task_Output";
import { Task_Restriction } from "./Task_Restriction";
import { uri } from "./uri";

export interface Task {
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
    instantiatesCanonical: canonical | null | undefined;
    instantiatesUri: uri | null | undefined;
    basedOn: Reference[] | null | undefined;
    groupIdentifier: Identifier | null | undefined;
    partOf: Reference[] | null | undefined;
    status: TaskStatus | null | undefined;
    statusReason: CodeableConcept | null | undefined;
    businessStatus: CodeableConcept | null | undefined;
    intent: TaskIntent | null | undefined;
    priority: code | null | undefined;
    code: CodeableConcept | null | undefined;
    description: string | null | undefined;
    focus: Reference | null | undefined;
    for: Reference | null | undefined;
    encounter: Reference | null | undefined;
    executionPeriod: Period | null | undefined;
    authoredOn: dateTime | null | undefined;
    lastModified: dateTime | null | undefined;
    requester: Reference | null | undefined;
    performerType: CodeableConcept[] | null | undefined;
    owner: Reference | null | undefined;
    location: Reference | null | undefined;
    reasonCode: CodeableConcept | null | undefined;
    reasonReference: Reference | null | undefined;
    insurance: Reference[] | null | undefined;
    note: Annotation[] | null | undefined;
    relevantHistory: Reference[] | null | undefined;
    restriction: Task_Restriction | null | undefined;
    input: Task_Input[] | null | undefined;
    output: Task_Output[] | null | undefined;
}

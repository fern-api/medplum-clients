import { Annotation } from "./Annotation";
import { canonical } from "./canonical";
import { CarePlan_Activity } from "./CarePlan_Activity";
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
import { uri } from "./uri";

export interface CarePlan {
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
    instantiatesCanonical: canonical[] | null | undefined;
    instantiatesUri: uri[] | null | undefined;
    basedOn: Reference[] | null | undefined;
    replaces: Reference[] | null | undefined;
    partOf: Reference[] | null | undefined;
    status: code | null | undefined;
    intent: code | null | undefined;
    category: CodeableConcept[] | null | undefined;
    title: string | null | undefined;
    description: string | null | undefined;
    subject: Reference;
    encounter: Reference | null | undefined;
    period: Period | null | undefined;
    created: dateTime | null | undefined;
    author: Reference | null | undefined;
    contributor: Reference[] | null | undefined;
    careTeam: Reference[] | null | undefined;
    addresses: Reference[] | null | undefined;
    supportingInfo: Reference[] | null | undefined;
    goal: Reference[] | null | undefined;
    activity: CarePlan_Activity[] | null | undefined;
    note: Annotation[] | null | undefined;
}

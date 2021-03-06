import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { instant } from "./instant";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Provenance_Agent } from "./Provenance_Agent";
import { Provenance_Entity } from "./Provenance_Entity";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { Signature } from "./Signature";
import { uri } from "./uri";

export interface Provenance {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    target: Reference[];
    occurredPeriod: Period | null | undefined;
    occurredDateTime: string | null | undefined;
    recorded: instant | null | undefined;
    policy: uri[] | null | undefined;
    location: Reference | null | undefined;
    reason: CodeableConcept[] | null | undefined;
    activity: CodeableConcept | null | undefined;
    agent: Provenance_Agent[];
    entity: Provenance_Entity[] | null | undefined;
    signature: Signature[] | null | undefined;
}

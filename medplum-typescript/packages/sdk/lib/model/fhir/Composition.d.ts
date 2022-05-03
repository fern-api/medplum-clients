import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { CompositionStatus } from "./CompositionStatus";
import { Composition_Attester } from "./Composition_Attester";
import { Composition_Event } from "./Composition_Event";
import { Composition_RelatesTo } from "./Composition_RelatesTo";
import { Composition_Section } from "./Composition_Section";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
export interface Composition {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier | null | undefined;
    status: CompositionStatus | null | undefined;
    type: CodeableConcept;
    category: CodeableConcept[] | null | undefined;
    subject: Reference | null | undefined;
    encounter: Reference | null | undefined;
    date: dateTime | null | undefined;
    author: Reference[];
    title: string | null | undefined;
    confidentiality: code | null | undefined;
    attester: Composition_Attester[] | null | undefined;
    custodian: Reference | null | undefined;
    relatesTo: Composition_RelatesTo[] | null | undefined;
    event: Composition_Event[] | null | undefined;
    section: Composition_Section[] | null | undefined;
}

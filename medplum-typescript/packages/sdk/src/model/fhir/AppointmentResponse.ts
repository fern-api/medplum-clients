import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { instant } from "./instant";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface AppointmentResponse {
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
    appointment: Reference;
    start: instant | null | undefined;
    end: instant | null | undefined;
    participantType: CodeableConcept[] | null | undefined;
    actor: Reference | null | undefined;
    participantStatus: code | null | undefined;
    comment: string | null | undefined;
}

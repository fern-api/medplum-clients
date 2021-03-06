import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { FlagStatus } from "./FlagStatus";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface Flag {
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
    status: FlagStatus | null | undefined;
    category: CodeableConcept[] | null | undefined;
    code: CodeableConcept;
    subject: Reference;
    period: Period | null | undefined;
    encounter: Reference | null | undefined;
    author: Reference | null | undefined;
}

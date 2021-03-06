import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { DocumentmanifestStatus } from "./DocumentmanifestStatus";
import { DocumentManifest_Related } from "./DocumentManifest_Related";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface DocumentManifest {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    masterIdentifier: Identifier | null | undefined;
    identifier: Identifier[] | null | undefined;
    status: DocumentmanifestStatus | null | undefined;
    type: CodeableConcept | null | undefined;
    subject: Reference | null | undefined;
    created: dateTime | null | undefined;
    author: Reference[] | null | undefined;
    recipient: Reference[] | null | undefined;
    source: uri | null | undefined;
    description: string | null | undefined;
    content: Reference[];
    related: DocumentManifest_Related[] | null | undefined;
}

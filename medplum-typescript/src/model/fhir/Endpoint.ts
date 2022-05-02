import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Coding } from "./Coding";
import { ContactPoint } from "./ContactPoint";
import { EndpointStatus } from "./EndpointStatus";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
import { url } from "./url";

export interface Endpoint {
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
    status: EndpointStatus | null | undefined;
    connectionType: Coding;
    name: string | null | undefined;
    managingOrganization: Reference | null | undefined;
    contact: ContactPoint[] | null | undefined;
    period: Period | null | undefined;
    payloadType: CodeableConcept[];
    payloadMimeType: code[] | null | undefined;
    address: url | null | undefined;
    header: string[] | null | undefined;
}

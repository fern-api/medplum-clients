import { Address } from "./Address";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { ContactPoint } from "./ContactPoint";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Organization_Contact } from "./Organization_Contact";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface Organization {
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
    active: boolean | null | undefined;
    type: CodeableConcept[] | null | undefined;
    name: string | null | undefined;
    alias: string[] | null | undefined;
    telecom: ContactPoint[] | null | undefined;
    address: Address[] | null | undefined;
    partOf: Reference | null | undefined;
    contact: Organization_Contact[] | null | undefined;
    endpoint: Reference[] | null | undefined;
}

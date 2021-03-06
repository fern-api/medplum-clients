import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { ContactPoint } from "./ContactPoint";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface OrganizationAffiliation {
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
    period: Period | null | undefined;
    organization: Reference | null | undefined;
    participatingOrganization: Reference | null | undefined;
    network: Reference[] | null | undefined;
    code: CodeableConcept[] | null | undefined;
    specialty: CodeableConcept[] | null | undefined;
    location: Reference[] | null | undefined;
    healthcareService: Reference[] | null | undefined;
    telecom: ContactPoint[] | null | undefined;
    endpoint: Reference[] | null | undefined;
}

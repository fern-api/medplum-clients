import { Address } from "./Address";
import { Attachment } from "./Attachment";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { ContactPoint } from "./ContactPoint";
import { date } from "./date";
import { Extension } from "./Extension";
import { HumanName } from "./HumanName";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { PractitionerGender } from "./PractitionerGender";
import { Practitioner_Qualification } from "./Practitioner_Qualification";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface Practitioner {
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
    name: HumanName[] | null | undefined;
    telecom: ContactPoint[] | null | undefined;
    address: Address[] | null | undefined;
    gender: PractitionerGender | null | undefined;
    birthDate: date | null | undefined;
    photo: Attachment[] | null | undefined;
    qualification: Practitioner_Qualification[] | null | undefined;
    communication: CodeableConcept[] | null | undefined;
}

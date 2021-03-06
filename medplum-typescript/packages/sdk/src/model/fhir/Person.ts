import { Address } from "./Address";
import { Attachment } from "./Attachment";
import { code } from "./code";
import { ContactPoint } from "./ContactPoint";
import { date } from "./date";
import { Extension } from "./Extension";
import { HumanName } from "./HumanName";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { PersonGender } from "./PersonGender";
import { Person_Link } from "./Person_Link";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface Person {
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
    name: HumanName[] | null | undefined;
    telecom: ContactPoint[] | null | undefined;
    gender: PersonGender | null | undefined;
    birthDate: date | null | undefined;
    address: Address[] | null | undefined;
    photo: Attachment | null | undefined;
    managingOrganization: Reference | null | undefined;
    active: boolean | null | undefined;
    link: Person_Link[] | null | undefined;
}

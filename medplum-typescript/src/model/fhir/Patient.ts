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
import { PatientGender } from "./PatientGender";
import { Patient_Communication } from "./Patient_Communication";
import { Patient_Contact } from "./Patient_Contact";
import { Patient_Link } from "./Patient_Link";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface Patient {
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
    gender: PatientGender | null | undefined;
    birthDate: date | null | undefined;
    deceasedBoolean: boolean | null | undefined;
    deceasedDateTime: string | null | undefined;
    address: Address[] | null | undefined;
    maritalStatus: CodeableConcept | null | undefined;
    multipleBirthBoolean: boolean | null | undefined;
    multipleBirthInteger: number | null | undefined;
    photo: Attachment[] | null | undefined;
    contact: Patient_Contact[] | null | undefined;
    communication: Patient_Communication[] | null | undefined;
    generalPractitioner: Reference[] | null | undefined;
    managingOrganization: Reference | null | undefined;
    link: Patient_Link[] | null | undefined;
}

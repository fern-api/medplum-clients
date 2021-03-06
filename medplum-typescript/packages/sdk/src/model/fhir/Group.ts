import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { GroupType } from "./GroupType";
import { Group_Characteristic } from "./Group_Characteristic";
import { Group_Member } from "./Group_Member";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { unsignedInt } from "./unsignedInt";
import { uri } from "./uri";

export interface Group {
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
    type: GroupType | null | undefined;
    actual: boolean | null | undefined;
    code: CodeableConcept | null | undefined;
    name: string | null | undefined;
    quantity: unsignedInt | null | undefined;
    managingEntity: Reference | null | undefined;
    characteristic: Group_Characteristic[] | null | undefined;
    member: Group_Member[] | null | undefined;
}

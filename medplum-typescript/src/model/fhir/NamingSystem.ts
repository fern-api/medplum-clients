import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { ContactDetail } from "./ContactDetail";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { markdown } from "./markdown";
import { Meta } from "./Meta";
import { NamingsystemKind } from "./NamingsystemKind";
import { NamingsystemStatus } from "./NamingsystemStatus";
import { NamingSystem_UniqueId } from "./NamingSystem_UniqueId";
import { Narrative } from "./Narrative";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
import { UsageContext } from "./UsageContext";

export interface NamingSystem {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    status: NamingsystemStatus | null | undefined;
    kind: NamingsystemKind | null | undefined;
    date: dateTime | null | undefined;
    publisher: string | null | undefined;
    contact: ContactDetail[] | null | undefined;
    responsible: string | null | undefined;
    type: CodeableConcept | null | undefined;
    description: markdown | null | undefined;
    useContext: UsageContext[] | null | undefined;
    jurisdiction: CodeableConcept[] | null | undefined;
    usage: string | null | undefined;
    uniqueId: NamingSystem_UniqueId[];
}

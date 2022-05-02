import { canonical } from "./canonical";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { ContactDetail } from "./ContactDetail";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { GraphdefinitionStatus } from "./GraphdefinitionStatus";
import { GraphDefinition_Link } from "./GraphDefinition_Link";
import { id } from "./id";
import { markdown } from "./markdown";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
import { UsageContext } from "./UsageContext";

export interface GraphDefinition {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    url: uri | null | undefined;
    version: string | null | undefined;
    name: string | null | undefined;
    status: GraphdefinitionStatus | null | undefined;
    experimental: boolean | null | undefined;
    date: dateTime | null | undefined;
    publisher: string | null | undefined;
    contact: ContactDetail[] | null | undefined;
    description: markdown | null | undefined;
    useContext: UsageContext[] | null | undefined;
    jurisdiction: CodeableConcept[] | null | undefined;
    purpose: markdown | null | undefined;
    start: code | null | undefined;
    profile: canonical | null | undefined;
    link: GraphDefinition_Link[] | null | undefined;
}
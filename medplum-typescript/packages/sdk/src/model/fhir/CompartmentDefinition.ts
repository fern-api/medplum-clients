import { code } from "./code";
import { CompartmentdefinitionCode } from "./CompartmentdefinitionCode";
import { CompartmentdefinitionStatus } from "./CompartmentdefinitionStatus";
import { CompartmentDefinition_Resource } from "./CompartmentDefinition_Resource";
import { ContactDetail } from "./ContactDetail";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { markdown } from "./markdown";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
import { UsageContext } from "./UsageContext";

export interface CompartmentDefinition {
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
    status: CompartmentdefinitionStatus | null | undefined;
    experimental: boolean | null | undefined;
    date: dateTime | null | undefined;
    publisher: string | null | undefined;
    contact: ContactDetail[] | null | undefined;
    description: markdown | null | undefined;
    useContext: UsageContext[] | null | undefined;
    purpose: markdown | null | undefined;
    code: CompartmentdefinitionCode | null | undefined;
    search: boolean | null | undefined;
    resource: CompartmentDefinition_Resource[] | null | undefined;
}

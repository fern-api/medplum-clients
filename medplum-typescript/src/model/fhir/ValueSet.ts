import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { ContactDetail } from "./ContactDetail";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { markdown } from "./markdown";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
import { UsageContext } from "./UsageContext";
import { ValuesetStatus } from "./ValuesetStatus";
import { ValueSet_Compose } from "./ValueSet_Compose";
import { ValueSet_Expansion } from "./ValueSet_Expansion";

export interface ValueSet {
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
    identifier: Identifier[] | null | undefined;
    version: string | null | undefined;
    name: string | null | undefined;
    title: string | null | undefined;
    status: ValuesetStatus | null | undefined;
    experimental: boolean | null | undefined;
    date: dateTime | null | undefined;
    publisher: string | null | undefined;
    contact: ContactDetail[] | null | undefined;
    description: markdown | null | undefined;
    useContext: UsageContext[] | null | undefined;
    jurisdiction: CodeableConcept[] | null | undefined;
    immutable: boolean | null | undefined;
    purpose: markdown | null | undefined;
    copyright: markdown | null | undefined;
    compose: ValueSet_Compose | null | undefined;
    expansion: ValueSet_Expansion | null | undefined;
}

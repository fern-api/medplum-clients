import { canonical } from "./canonical";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { ContactDetail } from "./ContactDetail";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { markdown } from "./markdown";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ResourceList } from "./ResourceList";
import { SearchparameterComparatorItem } from "./SearchparameterComparatorItem";
import { SearchparameterModifierItem } from "./SearchparameterModifierItem";
import { SearchparameterStatus } from "./SearchparameterStatus";
import { SearchparameterType } from "./SearchparameterType";
import { SearchparameterXpathusage } from "./SearchparameterXpathusage";
import { SearchParameter_Component } from "./SearchParameter_Component";
import { uri } from "./uri";
import { UsageContext } from "./UsageContext";

export interface SearchParameter {
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
    derivedFrom: canonical | null | undefined;
    status: SearchparameterStatus | null | undefined;
    experimental: boolean | null | undefined;
    date: dateTime | null | undefined;
    publisher: string | null | undefined;
    contact: ContactDetail[] | null | undefined;
    description: markdown | null | undefined;
    useContext: UsageContext[] | null | undefined;
    jurisdiction: CodeableConcept[] | null | undefined;
    purpose: markdown | null | undefined;
    code: code | null | undefined;
    base: code[] | null | undefined;
    type: SearchparameterType | null | undefined;
    expression: string | null | undefined;
    xpath: string | null | undefined;
    xpathUsage: SearchparameterXpathusage | null | undefined;
    target: code[] | null | undefined;
    multipleOr: boolean | null | undefined;
    multipleAnd: boolean | null | undefined;
    comparator: SearchparameterComparatorItem[] | null | undefined;
    modifier: SearchparameterModifierItem[] | null | undefined;
    chain: string[] | null | undefined;
    component: SearchParameter_Component[] | null | undefined;
}

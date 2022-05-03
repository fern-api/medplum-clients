import { canonical } from "./canonical";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Coding } from "./Coding";
import { ContactDetail } from "./ContactDetail";
import { date } from "./date";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { markdown } from "./markdown";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { QuestionnaireStatus } from "./QuestionnaireStatus";
import { Questionnaire_Item } from "./Questionnaire_Item";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
import { UsageContext } from "./UsageContext";

export interface Questionnaire {
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
    derivedFrom: canonical[] | null | undefined;
    status: QuestionnaireStatus | null | undefined;
    experimental: boolean | null | undefined;
    subjectType: code[] | null | undefined;
    date: dateTime | null | undefined;
    publisher: string | null | undefined;
    contact: ContactDetail[] | null | undefined;
    description: markdown | null | undefined;
    useContext: UsageContext[] | null | undefined;
    jurisdiction: CodeableConcept[] | null | undefined;
    purpose: markdown | null | undefined;
    copyright: markdown | null | undefined;
    approvalDate: date | null | undefined;
    lastReviewDate: date | null | undefined;
    effectivePeriod: Period | null | undefined;
    code: Coding[] | null | undefined;
    item: Questionnaire_Item[] | null | undefined;
}
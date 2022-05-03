import { canonical } from "./canonical";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
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
import { Reference } from "./Reference";
import { RelatedArtifact } from "./RelatedArtifact";
import { ResearchdefinitionStatus } from "./ResearchdefinitionStatus";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
import { UsageContext } from "./UsageContext";
export interface ResearchDefinition {
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
    shortTitle: string | null | undefined;
    subtitle: string | null | undefined;
    status: ResearchdefinitionStatus | null | undefined;
    experimental: boolean | null | undefined;
    subjectCodeableConcept: CodeableConcept | null | undefined;
    subjectReference: Reference | null | undefined;
    date: dateTime | null | undefined;
    publisher: string | null | undefined;
    contact: ContactDetail[] | null | undefined;
    description: markdown | null | undefined;
    comment: string[] | null | undefined;
    useContext: UsageContext[] | null | undefined;
    jurisdiction: CodeableConcept[] | null | undefined;
    purpose: markdown | null | undefined;
    usage: string | null | undefined;
    copyright: markdown | null | undefined;
    approvalDate: date | null | undefined;
    lastReviewDate: date | null | undefined;
    effectivePeriod: Period | null | undefined;
    topic: CodeableConcept[] | null | undefined;
    author: ContactDetail[] | null | undefined;
    editor: ContactDetail[] | null | undefined;
    reviewer: ContactDetail[] | null | undefined;
    endorser: ContactDetail[] | null | undefined;
    relatedArtifact: RelatedArtifact[] | null | undefined;
    library: canonical[] | null | undefined;
    population: Reference;
    exposure: Reference | null | undefined;
    exposureAlternative: Reference | null | undefined;
    outcome: Reference | null | undefined;
}

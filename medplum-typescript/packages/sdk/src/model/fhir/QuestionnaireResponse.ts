import { canonical } from "./canonical";
import { code } from "./code";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { QuestionnaireresponseStatus } from "./QuestionnaireresponseStatus";
import { QuestionnaireResponse_Item } from "./QuestionnaireResponse_Item";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface QuestionnaireResponse {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier | null | undefined;
    basedOn: Reference[] | null | undefined;
    partOf: Reference[] | null | undefined;
    questionnaire: canonical | null | undefined;
    status: QuestionnaireresponseStatus | null | undefined;
    subject: Reference | null | undefined;
    encounter: Reference | null | undefined;
    authored: dateTime | null | undefined;
    author: Reference | null | undefined;
    source: Reference | null | undefined;
    item: QuestionnaireResponse_Item[] | null | undefined;
}

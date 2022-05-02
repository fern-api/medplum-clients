import { Annotation } from "./Annotation";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { DataRequirement } from "./DataRequirement";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { GuidanceresponseStatus } from "./GuidanceresponseStatus";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface GuidanceResponse {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    requestIdentifier: Identifier | null | undefined;
    identifier: Identifier[] | null | undefined;
    moduleUri: string | null | undefined;
    moduleCanonical: string | null | undefined;
    moduleCodeableConcept: CodeableConcept | null | undefined;
    status: GuidanceresponseStatus | null | undefined;
    subject: Reference | null | undefined;
    encounter: Reference | null | undefined;
    occurrenceDateTime: dateTime | null | undefined;
    performer: Reference | null | undefined;
    reasonCode: CodeableConcept[] | null | undefined;
    reasonReference: Reference[] | null | undefined;
    note: Annotation[] | null | undefined;
    evaluationMessage: Reference[] | null | undefined;
    outputParameters: Reference | null | undefined;
    result: Reference | null | undefined;
    dataRequirement: DataRequirement[] | null | undefined;
}

import { canonical } from "./canonical";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { MeasurereportStatus } from "./MeasurereportStatus";
import { MeasurereportType } from "./MeasurereportType";
import { MeasureReport_Group } from "./MeasureReport_Group";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MeasureReport {
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
    status: MeasurereportStatus | null | undefined;
    type: MeasurereportType | null | undefined;
    measure: canonical;
    subject: Reference | null | undefined;
    date: dateTime | null | undefined;
    reporter: Reference | null | undefined;
    period: Period;
    improvementNotation: CodeableConcept | null | undefined;
    group: MeasureReport_Group[] | null | undefined;
    evaluatedResource: Reference[] | null | undefined;
}

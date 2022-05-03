import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface ImmunizationEvaluation {
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
    status: code | null | undefined;
    patient: Reference;
    date: dateTime | null | undefined;
    authority: Reference | null | undefined;
    targetDisease: CodeableConcept;
    immunizationEvent: Reference;
    doseStatus: CodeableConcept;
    doseStatusReason: CodeableConcept[] | null | undefined;
    description: string | null | undefined;
    series: string | null | undefined;
    doseNumberPositiveInt: number | null | undefined;
    doseNumberString: string | null | undefined;
    seriesDosesPositiveInt: number | null | undefined;
    seriesDosesString: string | null | undefined;
}

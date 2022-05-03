import { Annotation } from "./Annotation";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Dosage } from "./Dosage";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MedicationStatement {
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
    basedOn: Reference[] | null | undefined;
    partOf: Reference[] | null | undefined;
    status: code | null | undefined;
    statusReason: CodeableConcept[] | null | undefined;
    category: CodeableConcept | null | undefined;
    medicationCodeableConcept: CodeableConcept | null | undefined;
    medicationReference: Reference | null | undefined;
    subject: Reference;
    context: Reference | null | undefined;
    effectiveDateTime: string | null | undefined;
    effectivePeriod: Period | null | undefined;
    dateAsserted: dateTime | null | undefined;
    informationSource: Reference | null | undefined;
    derivedFrom: Reference[] | null | undefined;
    reasonCode: CodeableConcept[] | null | undefined;
    reasonReference: Reference[] | null | undefined;
    note: Annotation[] | null | undefined;
    dosage: Dosage[] | null | undefined;
}
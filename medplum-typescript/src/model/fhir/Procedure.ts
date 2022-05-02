import { Age } from "./Age";
import { Annotation } from "./Annotation";
import { canonical } from "./canonical";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Procedure_FocalDevice } from "./Procedure_FocalDevice";
import { Procedure_Performer } from "./Procedure_Performer";
import { Range } from "./Range";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface Procedure {
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
    instantiatesCanonical: canonical[] | null | undefined;
    instantiatesUri: uri[] | null | undefined;
    basedOn: Reference[] | null | undefined;
    partOf: Reference[] | null | undefined;
    status: code | null | undefined;
    statusReason: CodeableConcept | null | undefined;
    category: CodeableConcept | null | undefined;
    code: CodeableConcept | null | undefined;
    subject: Reference;
    encounter: Reference | null | undefined;
    performedDateTime: string | null | undefined;
    performedPeriod: Period | null | undefined;
    performedString: string | null | undefined;
    performedAge: Age | null | undefined;
    performedRange: Range | null | undefined;
    recorder: Reference | null | undefined;
    asserter: Reference | null | undefined;
    performer: Procedure_Performer[] | null | undefined;
    location: Reference | null | undefined;
    reasonCode: CodeableConcept[] | null | undefined;
    reasonReference: Reference[] | null | undefined;
    bodySite: CodeableConcept[] | null | undefined;
    outcome: CodeableConcept | null | undefined;
    report: Reference[] | null | undefined;
    complication: CodeableConcept[] | null | undefined;
    complicationDetail: Reference[] | null | undefined;
    followUp: CodeableConcept[] | null | undefined;
    note: Annotation[] | null | undefined;
    focalDevice: Procedure_FocalDevice[] | null | undefined;
    usedReference: Reference[] | null | undefined;
    usedCode: CodeableConcept[] | null | undefined;
}
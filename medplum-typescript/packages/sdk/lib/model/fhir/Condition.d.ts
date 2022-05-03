import { Age } from "./Age";
import { Annotation } from "./Annotation";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Condition_Evidence } from "./Condition_Evidence";
import { Condition_Stage } from "./Condition_Stage";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Range } from "./Range";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";
export interface Condition {
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
    clinicalStatus: CodeableConcept | null | undefined;
    verificationStatus: CodeableConcept | null | undefined;
    category: CodeableConcept[] | null | undefined;
    severity: CodeableConcept | null | undefined;
    code: CodeableConcept | null | undefined;
    bodySite: CodeableConcept[] | null | undefined;
    subject: Reference;
    encounter: Reference | null | undefined;
    onsetDateTime: string | null | undefined;
    onsetAge: Age | null | undefined;
    onsetPeriod: Period | null | undefined;
    onsetRange: Range | null | undefined;
    onsetString: string | null | undefined;
    abatementDateTime: string | null | undefined;
    abatementAge: Age | null | undefined;
    abatementPeriod: Period | null | undefined;
    abatementRange: Range | null | undefined;
    abatementString: string | null | undefined;
    recordedDate: dateTime | null | undefined;
    recorder: Reference | null | undefined;
    asserter: Reference | null | undefined;
    stage: Condition_Stage[] | null | undefined;
    evidence: Condition_Evidence[] | null | undefined;
    note: Annotation[] | null | undefined;
}

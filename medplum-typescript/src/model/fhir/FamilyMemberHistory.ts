import { Age } from "./Age";
import { Annotation } from "./Annotation";
import { canonical } from "./canonical";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { FamilymemberhistoryStatus } from "./FamilymemberhistoryStatus";
import { FamilyMemberHistory_Condition } from "./FamilyMemberHistory_Condition";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Range } from "./Range";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface FamilyMemberHistory {
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
    status: FamilymemberhistoryStatus | null | undefined;
    dataAbsentReason: CodeableConcept | null | undefined;
    patient: Reference;
    date: dateTime | null | undefined;
    name: string | null | undefined;
    relationship: CodeableConcept;
    sex: CodeableConcept | null | undefined;
    bornPeriod: Period | null | undefined;
    bornDate: string | null | undefined;
    bornString: string | null | undefined;
    ageAge: Age | null | undefined;
    ageRange: Range | null | undefined;
    ageString: string | null | undefined;
    estimatedAge: boolean | null | undefined;
    deceasedBoolean: boolean | null | undefined;
    deceasedAge: Age | null | undefined;
    deceasedRange: Range | null | undefined;
    deceasedDate: string | null | undefined;
    deceasedString: string | null | undefined;
    reasonCode: CodeableConcept[] | null | undefined;
    reasonReference: Reference[] | null | undefined;
    note: Annotation[] | null | undefined;
    condition: FamilyMemberHistory_Condition[] | null | undefined;
}
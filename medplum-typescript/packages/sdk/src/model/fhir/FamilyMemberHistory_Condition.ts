import { Age } from "./Age";
import { Annotation } from "./Annotation";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Range } from "./Range";

export interface FamilyMemberHistory_Condition {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    code: CodeableConcept;
    outcome: CodeableConcept | null | undefined;
    contributedToDeath: boolean | null | undefined;
    onsetAge: Age | null | undefined;
    onsetRange: Range | null | undefined;
    onsetPeriod: Period | null | undefined;
    onsetString: string | null | undefined;
    note: Annotation[] | null | undefined;
}

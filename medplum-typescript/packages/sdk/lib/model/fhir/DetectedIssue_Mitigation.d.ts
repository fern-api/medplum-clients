import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface DetectedIssue_Mitigation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    action: CodeableConcept;
    date: dateTime | null | undefined;
    author: Reference | null | undefined;
}

import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { Timing_Repeat } from "./Timing_Repeat";
export interface Timing {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    event: dateTime[] | null | undefined;
    repeat: Timing_Repeat | null | undefined;
    code: CodeableConcept | null | undefined;
}

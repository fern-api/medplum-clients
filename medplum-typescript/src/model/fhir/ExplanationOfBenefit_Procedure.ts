import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { positiveInt } from "./positiveInt";
import { Reference } from "./Reference";

export interface ExplanationOfBenefit_Procedure {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    sequence: positiveInt | null | undefined;
    type: CodeableConcept[] | null | undefined;
    date: dateTime | null | undefined;
    procedureCodeableConcept: CodeableConcept | null | undefined;
    procedureReference: Reference | null | undefined;
    udi: Reference[] | null | undefined;
}

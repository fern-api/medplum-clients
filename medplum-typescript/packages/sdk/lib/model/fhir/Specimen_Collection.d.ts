import { CodeableConcept } from "./CodeableConcept";
import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";
export interface Specimen_Collection {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    collector: Reference | null | undefined;
    collectedDateTime: string | null | undefined;
    collectedPeriod: Period | null | undefined;
    duration: Duration | null | undefined;
    quantity: Quantity | null | undefined;
    method: CodeableConcept | null | undefined;
    bodySite: CodeableConcept | null | undefined;
    fastingStatusCodeableConcept: CodeableConcept | null | undefined;
    fastingStatusDuration: Duration | null | undefined;
}

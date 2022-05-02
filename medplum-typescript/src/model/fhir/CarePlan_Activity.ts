import { Annotation } from "./Annotation";
import { CarePlan_Detail } from "./CarePlan_Detail";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface CarePlan_Activity {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    outcomeCodeableConcept: CodeableConcept[] | null | undefined;
    outcomeReference: Reference[] | null | undefined;
    progress: Annotation[] | null | undefined;
    reference: Reference | null | undefined;
    detail: CarePlan_Detail | null | undefined;
}

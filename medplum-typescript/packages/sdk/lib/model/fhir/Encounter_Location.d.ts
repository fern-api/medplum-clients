import { CodeableConcept } from "./CodeableConcept";
import { Encounter_locationStatus } from "./Encounter_locationStatus";
import { Extension } from "./Extension";
import { Period } from "./Period";
import { Reference } from "./Reference";
export interface Encounter_Location {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    location: Reference;
    status: Encounter_locationStatus | null | undefined;
    physicalType: CodeableConcept | null | undefined;
    period: Period | null | undefined;
}

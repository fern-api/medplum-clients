import { Encounter_statushistoryStatus } from "./Encounter_statushistoryStatus";
import { Extension } from "./Extension";
import { Period } from "./Period";

export interface Encounter_StatusHistory {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    status: Encounter_statushistoryStatus | null | undefined;
    period: Period;
}

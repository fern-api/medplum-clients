import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";

export interface MedicationKnowledge_Kinetics {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    areaUnderCurve: Quantity[] | null | undefined;
    lethalDose50: Quantity[] | null | undefined;
    halfLifePeriod: Duration | null | undefined;
}

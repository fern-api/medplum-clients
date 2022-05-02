import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";

export interface MedicationKnowledge_MaxDispense {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    quantity: Quantity;
    period: Duration | null | undefined;
}

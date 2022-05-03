import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { Quantity } from "./Quantity";
export interface MedicationRequest_InitialFill {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    quantity: Quantity | null | undefined;
    duration: Duration | null | undefined;
}

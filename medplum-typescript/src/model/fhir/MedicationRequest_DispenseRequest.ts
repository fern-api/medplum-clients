import { Duration } from "./Duration";
import { Extension } from "./Extension";
import { MedicationRequest_InitialFill } from "./MedicationRequest_InitialFill";
import { Period } from "./Period";
import { Quantity } from "./Quantity";
import { Reference } from "./Reference";
import { unsignedInt } from "./unsignedInt";

export interface MedicationRequest_DispenseRequest {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    initialFill: MedicationRequest_InitialFill | null | undefined;
    dispenseInterval: Duration | null | undefined;
    validityPeriod: Period | null | undefined;
    numberOfRepeatsAllowed: unsignedInt | null | undefined;
    quantity: Quantity | null | undefined;
    expectedSupplyDuration: Duration | null | undefined;
    performer: Reference | null | undefined;
}

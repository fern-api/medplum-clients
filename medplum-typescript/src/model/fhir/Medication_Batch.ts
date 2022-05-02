import { dateTime } from "./dateTime";
import { Extension } from "./Extension";

export interface Medication_Batch {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    lotNumber: string | null | undefined;
    expirationDate: dateTime | null | undefined;
}

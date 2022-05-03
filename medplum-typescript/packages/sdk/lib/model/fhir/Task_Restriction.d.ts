import { Extension } from "./Extension";
import { Period } from "./Period";
import { positiveInt } from "./positiveInt";
import { Reference } from "./Reference";
export interface Task_Restriction {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    repetitions: positiveInt | null | undefined;
    period: Period | null | undefined;
    recipient: Reference[] | null | undefined;
}

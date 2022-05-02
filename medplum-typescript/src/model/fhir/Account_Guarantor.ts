import { Extension } from "./Extension";
import { Period } from "./Period";
import { Reference } from "./Reference";

export interface Account_Guarantor {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    party: Reference;
    onHold: boolean | null | undefined;
    period: Period | null | undefined;
}

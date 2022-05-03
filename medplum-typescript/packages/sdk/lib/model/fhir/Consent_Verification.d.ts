import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { Reference } from "./Reference";
export interface Consent_Verification {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    verified: boolean | null | undefined;
    verifiedWith: Reference | null | undefined;
    verificationDate: dateTime | null | undefined;
}

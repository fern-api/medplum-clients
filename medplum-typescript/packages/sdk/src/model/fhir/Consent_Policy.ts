import { Extension } from "./Extension";
import { uri } from "./uri";

export interface Consent_Policy {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    authority: uri | null | undefined;
    uri: uri | null | undefined;
}
